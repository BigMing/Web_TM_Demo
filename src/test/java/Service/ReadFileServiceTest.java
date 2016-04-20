package Service;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunjm on 2016/4/1.
 */
public class ReadFileServiceTest {
    ReadFileService readFileService = new ReadFileService();
    @Test
    public void getEnglishList() throws Exception {
/*        List<String> stringList = readFileService.readFile("C:\\index_file_1\\corpus_0.05.txt");
        List<String> englishList = readFileService.getEnglishList(stringList);*/
    }

    @Test
    public void getChineseList() throws Exception {
        List<String> stringList = readFileService.readFile("C:\\index_file_1\\corpus_0.05.txt");
        List<String> chineseList = readFileService.getChineseList(stringList);
    }

    @Test
    public void getChinesePath() throws Exception {
/*        List<String> filePathList = readFileService.getAbsolutePaths("C:\\index_file");
        System.out.print(readFileService.getChinesePath(filePathList));*/
    }

    @Test
    public void getEnglishPath() throws Exception {
/*        List<String> filePathList = readFileService.getAbsolutePaths("C:\\index_file");
        System.out.print(readFileService.getEnglishPath(filePathList));*/
    }

    @Test
    public void getAbsolutePaths() throws Exception {
/*        System.out.println(readFileService.getAbsolutePaths(
                "C:\\index_file"
        ));*/
    }

    @Test
    public void readFile() throws Exception {
/*        System.out.print(readFileService.readFile(
                "C:\\index_file_1\\corpus_0.05.txt"
        ));*/
    }
}