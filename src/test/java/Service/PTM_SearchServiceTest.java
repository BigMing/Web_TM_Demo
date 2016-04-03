package Service;

import Dao.PTM_Sentence;
import org.junit.Test;

import java.util.Map;

/**
 * Created by sunjm on 2016/4/1.
 */
public class PTM_SearchServiceTest {

    PTM_SearchService ptm_searchService = new PTM_SearchService();

    @Test
    public void simanticSearch() throws Exception {
        System.out.println("语义相似：");
        Map<PTM_Sentence,Float> sentenceMap = ptm_searchService.simanticSearch(
                "Edit your feed by updating the users you follow and repositories you watch.");
        for (Map.Entry<PTM_Sentence,Float> entry : sentenceMap.entrySet()){
            System.out.println(entry.getKey().getSource_sentence() +
                    "  译文： " + entry.getKey().getTarget_sentence() +
                    " 相似分数： " + entry.getValue());
        }
    }

    @Test
    public void wordOrderSearch() throws Exception {
/*        System.out.println("词序相似：");
        Map<PTM_Sentence,Float> sentenceMap = ptm_searchService.wordOrderSearch(
                "Edit your feed by updating the users you follow and repositories you watch.");
        for (Map.Entry<PTM_Sentence,Float> entry : sentenceMap.entrySet()){
            System.out.println(entry.getKey().getSource_sentence() +
                    "  译文： " + entry.getKey().getTarget_sentence() +
                    " 相似分数： " + entry.getValue());
        }*/
    }

    @Test
    public void search_Source_Sentence() throws Exception {
/*        Map<PTM_Sentence,Float> sentenceMap = ptm_searchService.Search_Source_Sentence(
                "Edit your feed by updating the users you follow and repositories you watch.");
        for (Map.Entry<PTM_Sentence,Float> entry : sentenceMap.entrySet()){
            System.out.println(entry.getKey().getSource_sentence() +
                    "  译文： " + entry.getKey().getTarget_sentence() +
                    " 相似分数： " + entry.getValue());
        }*/
    }

    @Test
    public void sortSearchReasult() throws Exception {
/*        Map<PTM_Sentence,Float> sentenceMap = ptm_searchService.Search_Source_Sentence(
                "I know we're supposed to do whatever it is to get Tiana back...");

        //Map<PTM_Sentence,Float> sortedMap = ptm_searchService.sortSearchReasult(sentenceMap);

        for (PTM_Sentence ptm_sentence : sentenceMap.keySet()){
            System.out.println(ptm_sentence.getSource_sentence());
        }
        for (Map.Entry<PTM_Sentence,Float> entry : sentenceMap.entrySet()){
            System.out.println(entry.getKey().getSource_sentence() +
            " 相似分数： " + entry.getValue());
        }*/
    }
}