package Service;

/*import com.aliasi.spell.TfIdfDistance;
import com.aliasi.tokenizer.IndoEuropeanTokenizerFactory;
import com.aliasi.tokenizer.TokenizerFactory;*/
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.en.PorterStemFilter;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.util.CharArraySet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2015/5/29.
 */
public class SentenceAnalyzeService {

/*    public List<String> PorterStemer(String text) throws IOException {
        List<String> textList = new ArrayList<String>();
        StringReader sr = new StringReader(text);
        LowerCaseTokenizer lowerCaseTokenizer = new LowerCaseTokenizer(sr);
        PorterStemFilter filter = new PorterStemFilter(lowerCaseTokenizer);
        while (filter.incrementToken()){
            CharTermAttribute charTermAttribute = filter.getAttribute(CharTermAttribute.class);
            System.out.println(charTermAttribute.toString());
            textList.add(charTermAttribute.toString());
        }
        return textList;
    }*/

    public List<String> PorterStemer(String text) throws IOException{
        List<String> textList = new ArrayList<String>();
        StandardAnalyzer standardAnalyzer = new StandardAnalyzer();
        TokenStream tokenStream = standardAnalyzer.tokenStream("fieldname",text);
        tokenStream.reset();
        tokenStream = new PorterStemFilter(tokenStream);
        while (tokenStream.incrementToken()){
            CharTermAttribute charTermAttribute = tokenStream.getAttribute(CharTermAttribute.class);
            //System.out.println(charTermAttribute.toString());
            textList.add(charTermAttribute.toString());
        }
        return textList;
    }

    public List<String> StandardStermer(String text){
        List<String> newText = new ArrayList<String>();
        try {
            CharArraySet charArraySet = new CharArraySet(0, true);
            Iterator<Object> iterator = StandardAnalyzer.STOP_WORDS_SET.iterator();
            while (iterator.hasNext()) {
                charArraySet.add(iterator.next());
            }

            StandardAnalyzer standardAnalyzer = new StandardAnalyzer(charArraySet);
            TokenStream tokenStream = standardAnalyzer.tokenStream("field", text);
            CharTermAttribute charTermAttribute = tokenStream.addAttribute(CharTermAttribute.class);
            tokenStream.reset();
            while (tokenStream.incrementToken()){
                newText.add(charTermAttribute.toString());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return newText;
    }

    public List<String> getUnionSet(List<String> text_1, List<String> text_2) {
        text_2.removeAll(text_1);
        text_1.addAll(text_2);
        return text_1;
    }

    public List<String> getRepetitonSet(List<String> list_1, List<String> list_2) {
        list_1.retainAll(list_2);
        return list_1;
    }

/*    public HashMap<String,Double> getIdfValue(List<String> stringList) {
        HashMap<String,Double> idfValue = new HashMap<String,Double>();
        TokenizerFactory tokenizerFactory = IndoEuropeanTokenizerFactory.INSTANCE;
        TfIdfDistance tfIdf = new TfIdfDistance(tokenizerFactory);
        for (String s: stringList){
            tfIdf.handle(s);
        }
        for (String term: tfIdf.termSet()){
            idfValue.put(term,tfIdf.idf(term));
        }
        return idfValue;
    }*/
}
