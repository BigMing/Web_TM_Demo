package Service;

import org.junit.Test;

/**
 * Created by sunjm on 2016/4/1.
 */
public class ReadFileServiceTest {
    ReadFileService readFileService = new ReadFileService();

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
        System.out.print(readFileService.readFile(
                "C:\\index_file\\Cold.Case.S02E01.720p.HDTV.DD2.0.x264-DcX.chs&eng.繁体&英文.srt英.txt"
        ));
    }
}