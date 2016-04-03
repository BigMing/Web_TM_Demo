package Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/5/29.
 * 提供了其他计算句子相似度的方法
 */
public class CalculateSimilarityService {

    SentenceAnalyzeService sentenceAnalyzeService = new SentenceAnalyzeService();
    WordNetService wordNetService = new WordNetService();

    public float getWordOrderSimilarity(String t1, String t2) {
        List<String> l1 = sentenceAnalyzeService.StandardStermer(t1);
        List<String> l2 = sentenceAnalyzeService.StandardStermer(t2);
        List<String> repetitonSet = sentenceAnalyzeService.getRepetitonSet(l1,l2);
        List<Integer> r1 = new ArrayList<Integer>();
        for (int i = 0; i < repetitonSet.size(); i++) {
            for (int j = 0; j < l1.size(); j++) {
                if (repetitonSet.get(i).equals(l1.get(j))){
                    r1.add(j + 1);
                }
            }
        }
        List<Integer> r2 = new ArrayList<Integer>();
        for (int i = 0; i < repetitonSet.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (repetitonSet.get(i).equals(l2.get(j))){
                    r2.add(j + 1);
                }
            }
        }
        double f1 = 0;
        for (int i = 0; i < repetitonSet.size(); i++) {
            f1 += Math.pow(r1.get(i) - r2.get(i),2);
        }
        double f2 = 0;
        for (int i = 0; i < repetitonSet.size(); i++) {
            f2 += Math.pow(r1.get(i) + r2.get(i),2);
        }
        f1 = Math.sqrt(f1);
        f2 = Math.sqrt(f2);
        return (float) (1 - f1 / f2);
    }

    public float getSimanticSimilarity(String s1,String s2){
        List<String> l1 = sentenceAnalyzeService.StandardStermer(s1);
        List<String> l2 = sentenceAnalyzeService.StandardStermer(s2);
        float sum = 0;
        for (String str1: l1){
            for (String str2: l2){
                double sc = wordNetService.maxScoreOfLin(str1,str2);
                sum += sc;
            }
        }
        return sum/(l1.size() * l2.size());
    }

    /*    public double getSimanticSimilarity_0(String s1, String s2, HashMap<String,Double> idfValue){
        HashMap<String,String> h1 = stanfordCoreNLPService.getPOS(s1);
        HashMap<String,String> h2 = stanfordCoreNLPService.getPOS(s2);

        double sumOfIdf1 = sumOfIdfValue(h1,idfValue);
        double sumOfIdf2 = sumOfIdfValue(h2,idfValue);

        Iterator iterator1 = h1.entrySet().iterator();
        Iterator iterator2 = h2.entrySet().iterator();
        double sum1 = 0.0;
        while (iterator1.hasNext()){
            Map.Entry entry1 = (Map.Entry)iterator1.next();
            double temp = 0.0;
            while (iterator2.hasNext()){
                Map.Entry entry2 = (Map.Entry)iterator2.next();
                if (entry1.getValue().equals(entry2.getValue())){
                    if (wordNetService.maxScoreOfLin(
                            (String)entry1.getKey(),(String)entry2.getKey()) > temp){
                        temp = wordNetService.maxScoreOfLin(
                                (String)entry1.getKey(),(String)entry2.getKey());
                    }
                }
            }
            sum1 += temp;
        }
        double sum2 = 0.0;
        while (iterator2.hasNext()){
            Map.Entry entry2 = (Map.Entry)iterator2.next();
            double temp = 0.0;
            while (iterator1.hasNext()){
                Map.Entry entry1 = (Map.Entry)iterator1.next();
                if (entry2.getValue().equals(entry1.getValue())){
                    if (wordNetService.maxScoreOfLin(
                            (String)entry2.getKey(),(String)entry1.getKey()) > temp){
                        temp = wordNetService.maxScoreOfLin(
                                (String)entry2.getKey(),(String)entry1.getKey());
                    }
                }
            }
            sum2 += temp;
        }
        return 0.5 * (sum1 / sumOfIdf1 + sum2/sumOfIdf2);
    }*/

/*    public List<Double> generateVector(HashMap<String,Double> idfValue, List<String> text) {
        List<Double> vector = new ArrayList<Double>();
        for (String s: text){
            if (idfValue.containsKey(s)){
                vector.add(idfValue.get(s));
            }else {
                vector.add(0.0);
            }
        }
        return vector;
    }*/

/*    public double getVectorSimilarity(String s1,String s2,HashMap<String,Double> idf) {
        List<String> list_1 = standardNLPService.moveStopWords(s1);
        List<String> list_2 = standardNLPService.moveStopWords(s2);
        HashMap<String,Double> h1 = new HashMap<String, Double>();
        for (String s: list_1){
            if (idf.containsKey(s)){
                h1.put(s,idf.get(s));
            }else {
                h1.put(s,10.0);
            }
        }
        HashMap<String,Double> h2 = new HashMap<String, Double>();
        for (String s: list_2){
            if (idf.containsKey(s)){
                h2.put(s,idf.get(s));
            }else {
                h2.put(s,10.0);
            }
        }
        List<Double> v1 = generateVector(h1, standardNLPService.getUnionSet(list_1, list_2));
        List<Double> v2 = generateVector(h2, standardNLPService.getUnionSet(list_1, list_2));
        double d1 = 0.0;
        for (int i = 0;i < v1.size();i++){
            d1 += v1.get(i) * v2.get(i);
        }
        double d2 = 0.0;
        for (int i = 0; i < v1.size();i++){
            d2 += Math.pow(v1.get(i),2);
        }
        d2 = Math.sqrt(d2);
        double d3 = 0.0;
        for (int i = 0; i < v1.size();i++){
            d3 += Math.pow(v2.get(i),2);
        }
        d3 = Math.sqrt(d3);
        return d1 / (d2 + d3);
    }*/

/*    public double sumOfIdfValue(HashMap<String,String> map,HashMap<String,Double> idf){
        double sum = 0.0;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            if (idf.containsKey(entry.getKey())){
                sum += idf.get(entry.getKey());
            }else {
                sum += 10;
            }
        }
        return sum;
    }*/
}
