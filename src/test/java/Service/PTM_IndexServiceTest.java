package Service;

import org.junit.Test;

/**
 * Created by sunjm on 2016/4/1.
 */
public class PTM_IndexServiceTest {
    ReadFileService readFileService = new ReadFileService();
    PTM_IndexService ptm_indexService = new PTM_IndexService();
    @Test
    public void index_PTM_Article() throws Exception {

    }

    @Test
    public void index_PTM_Sentence() throws Exception {

    }

    @Test
    public void pack_PTM_Sentence() throws Exception {
/*        List<String> filePathList = readFileService.getAbsolutePaths("C:\\index_file");
        //System.out.println(readFileService.getEnglishPath(filePathList));
        List<PTM_Sentence> sentenceList = ptm_indexService.pack_PTM_Sentence(
                readFileService.getChinesePath(filePathList),readFileService.getEnglishPath(filePathList)
        );
        System.out.println("句子总数 : " + sentenceList.size());*/
    }

    @Test
    public void indexSentence() throws Exception {
        //ptm_indexService.indexSentence("C:\\index_file");
        ptm_indexService.index("C:\\index_file_1\\corpus_0.05.txt");
    }
}