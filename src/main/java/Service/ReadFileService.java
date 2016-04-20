package Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/5/29.
 * 此类本地测试用，基于中英对应的txt文件进行读取处理
 */
public class ReadFileService {

    //输入文件夹路径，返回该文件夹下所有txt文件的绝对路径
    public List<String> getAbsolutePaths(String forderName){
        try {
            List<String> temp = new ArrayList<String>();
            File file = new File(forderName);
            if (!file.isDirectory()) {
                System.out.println("文件：" + file.getAbsolutePath());
                return null;
            } else {
                String[] fileList = file.list();
                for (int i = 0; i < fileList.length; i++) {
                    File readFile = new File(forderName + "\\" + fileList[i]);
                    temp.add(readFile.getAbsolutePath());
                }
                return temp;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    //输入txt文件的绝对路径，返回该txt文件中每行句子的list
    public List<String> readFile(String filePath){
        List<String> tm_list = new ArrayList<String>();
        InputStreamReader isr;
        try{
            isr = new InputStreamReader(new FileInputStream(filePath), "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String tempstring = null;

            while((tempstring = br.readLine())!= null){
                //System.out.println(tempstring);
                tm_list.add(tempstring);
            }
            br.close();
            isr.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return tm_list;
    }

    //输入所有txt路径，返回中文的txt路径
    public List<String> getChinesePath(List<String> filePathList){
        List<String> chinesePath = new ArrayList<String>();
        for (int i = 0;i < filePathList.size();i += 2){
            chinesePath.add(filePathList.get(i));
        }
        return chinesePath;
    }

    //输入所有txt路径，返回英文的txt路径
    public List<String> getEnglishPath(List<String> filePathList){
        List<String> englishPath = new ArrayList<String>();
        for (int i = 1;i < filePathList.size();i += 2){
            englishPath.add(filePathList.get(i));
        }
        return englishPath;
    }

    public List<String> getEnglishList(List<String> text){
        List<String> englishList = new ArrayList<String>();
        for (int i = 2;i < text.size();i += 3){
            englishList.add(text.get(i));
            //System.out.println(text.get(i));
        }
        return englishList;
    }

    public List<String> getChineseList(List<String> text){
        List<String> chineseList = new ArrayList<String>();
        for (int i = 1;i < text.size();i += 3){
            chineseList.add(text.get(i));
            //System.out.println(text.get(i));
        }
        return chineseList;
    }
}
