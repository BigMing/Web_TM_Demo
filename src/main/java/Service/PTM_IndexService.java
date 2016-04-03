package Service;

import Dao.PTM_Article;
import Dao.PTM_Sentence;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunjm on 2016/3/29.
 */
public class PTM_IndexService {
    public JsonService jsonService  = new JsonService();
    //public ClientService clientService;
    public Client client;

    public ReadFileService readFileService = new ReadFileService();

    public PTM_IndexService(){
        try {
            client = TransportClient.builder().build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"),9300)
                    );
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    //输入ptm_article的对象进行本地索引
    public void Index_PTM_Article(PTM_Article ptm_article){
        IndexResponse response = client.prepareIndex("web_tm","ptm_article")
                .setSource(jsonService.generatePTM_Article(ptm_article))
                .get();
    }

    //输入ptm_sentence的对象进行本地索引
    public void Index_PTM_Sentence(PTM_Sentence ptm_sentence){
        IndexResponse response = client.prepareIndex("web_tm","ptm_sentence")
                .setSource(jsonService.generatePTM_Sentence(ptm_sentence))
                .get();
    }

    //本地测试用，输入对应的中英翻译，包装成部分属性缺省的ptm_sentence对象
    public List<PTM_Sentence> pack_PTM_Sentence(List<String> chinesePathList, List<String> englishPathList){
        List<PTM_Sentence> sentenceList = new ArrayList<PTM_Sentence>();
        for (int i = 0; i < chinesePathList.size() && i < englishPathList.size(); i++){
            //System.out.println(readFileService.readFile(chinesePathList.get(i)));
            List<String> sourceSentence = readFileService.readFile(englishPathList.get(i));
            List<String> targetSentence = readFileService.readFile(chinesePathList.get(i));
            for (int j = 0; j < sourceSentence.size() && j < targetSentence.size(); j++){
                //System.out.println(sourceSentence.get(j));
                sentenceList.add(
                        new PTM_Sentence(sourceSentence.get(j),targetSentence.get(j))
                );
            }
        }
        return sentenceList;
    }

    //输入文件夹路径，索引测试用句子
    public void indexSentence(String folderPath){
        List<String> filePathList = readFileService.getAbsolutePaths(folderPath);
        List<PTM_Sentence> senteceList = pack_PTM_Sentence(
                readFileService.getChinesePath(filePathList),readFileService.getEnglishPath(filePathList));
        //System.out.println(senteceList.size());
        for (PTM_Sentence ptm_sentence:senteceList){
            Index_PTM_Sentence(ptm_sentence);
        }
    }
}
