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
    public void optimalSearch() throws Exception {
        System.out.println("最优搜索：");
        Map<PTM_Sentence,Float> sentenceMap = ptm_searchService.optimalSearch(
                "This is a tired afternoon.");
        for (Map.Entry<PTM_Sentence,Float> entry : sentenceMap.entrySet()){
            System.out.println(entry.getKey().getSource_sentence() +
                    "  译文： " + entry.getKey().getTarget_sentence() +
                    "  相似分数： " + entry.getValue()
            );
        }
    }
}