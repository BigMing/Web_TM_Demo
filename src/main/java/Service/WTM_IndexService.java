package Service;

import Dao.WTM_Article;
import Dao.WTM_Paragraph;
import Dao.WTM_Sentence;
import Dao.WTM_Translation;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by sunjm on 2016/3/30.
 * 输入WTM的相关对象进行本地索引
 */
public class WTM_IndexService {
    public JsonService jsonService = new JsonService();
    //public ClientService clientService;
    public Client client;

    public WTM_IndexService(){
        try {
            client = TransportClient.builder().build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"),9300)
                    );
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void Index_WTM_Article(WTM_Article wtm_article){
        IndexResponse response = client.prepareIndex("web_tm","wtm_article")
                .setSource(jsonService.generateWTM_Article(wtm_article))
                .get();
    }

    public void Index_WTM_Paragraph(WTM_Paragraph wtm_paragraph){
        IndexResponse response = client.prepareIndex("web_tm","wtm_paragraph")
                .setSource(jsonService.generateWTM_Paragraph(wtm_paragraph))
                .get();
    }

    public void Index_WTM_Sentence(WTM_Sentence wtm_sentence){
        IndexResponse response = client.prepareIndex("web_tm","wtm_sentence")
                .setSource(jsonService.generateWTM_Sentence(wtm_sentence))
                .get();
    }

    public void Index_WTM_translation(WTM_Translation wtm_translation){
        IndexResponse response = client.prepareIndex("web_tm","wtm_translation")
                .setSource(jsonService.generateWTM_Translation(wtm_translation))
                .get();
    }
}
