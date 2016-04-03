package Dao;

/**
 * Created by Administrator on 2016/1/7.
 */
public class PTM_Sentence {
    private int sid;
    private int article_id;
    private String source_lang;
    private String target_lang;
    private String source_sentence;
    private String target_sentence;
    private String translator;
    private String provenience;
    private Double ranking;
    private String remark;

    public PTM_Sentence(int sid, int article_id, String source_lang, String target_lang,
                        String source_sentence, String target_sentence, String translator,
                        String provenience, Double ranking, String remark) {
        this.sid = sid;
        this.article_id = article_id;
        this.source_lang = source_lang;
        this.target_lang = target_lang;
        this.source_sentence = source_sentence;
        this.target_sentence = target_sentence;
        this.translator = translator;
        this.provenience = provenience;
        this.ranking = ranking;
        this.remark = remark;
    }

    public PTM_Sentence(String source_sentence,String target_sentence){
        this(0,0,"en","zh-cn",source_sentence,target_sentence,null,"movie_title",null,null);
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getSource_lang() {
        return source_lang;
    }

    public void setSource_lang(String source_lang) {
        this.source_lang = source_lang;
    }

    public String getTarget_lang() {
        return target_lang;
    }

    public void setTarget_lang(String target_lang) {
        this.target_lang = target_lang;
    }

    public String getSource_sentence() {
        return source_sentence;
    }

    public void setSource_sentence(String source_sentence) {
        this.source_sentence = source_sentence;
    }

    public String getTarget_sentence() {
        return target_sentence;
    }

    public void setTarget_sentence(String target_sentence) {
        this.target_sentence = target_sentence;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getProvenience() {
        return provenience;
    }

    public void setProvenience(String provenience) {
        this.provenience = provenience;
    }

    public Double getRanking() {
        return ranking;
    }

    public void setRanking(Double ranking) {
        this.ranking = ranking;
    }
}
