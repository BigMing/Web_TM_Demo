package Service;

import org.junit.Test;

/**
 * Created by sunjm on 2016/4/2.
 */
public class SentenceAnalyzeServiceTest {

    SentenceAnalyzeService sentenceAnalyzeService = new SentenceAnalyzeService();
    @Test
    public void porterStemer() throws Exception {
        System.out.println("Porter方法：");
        System.out.println(sentenceAnalyzeService.PorterStemer(
                "I know we're supposed to do whatever it is to get Tiana back..."));
    }

    @Test
    public void moveStopWords() throws Exception {
        System.out.println("Standard方法：");
        System.out.println(sentenceAnalyzeService.StandardStermer(
                "I know we're supposed to do whatever it is to get Tiana back..."));
    }

    @Test
    public void getUnionSet() throws Exception {

    }

    @Test
    public void getRepetitonSet() throws Exception {

    }

}