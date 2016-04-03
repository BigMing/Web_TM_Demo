package Service;

import edu.sussex.nlp.jws.JWS;
import edu.sussex.nlp.jws.Lin;

/**
 * Created by Administrator on 2015/5/29.
 */
public class WordNetService {
    private String dir = "C:\\Program Files (x86)\\WordNet";
    private JWS ws = new JWS(dir,"2.1");

    public double maxScoreOfLin(String s1,String s2){
        Lin lin = ws.getLin();
        double sc = lin.max(s1,s2,"n");
        double sc1 = lin.max(s1,s2,"v");
        if (sc > sc1)
            return sc;
        else
            return sc1;
    }
}
