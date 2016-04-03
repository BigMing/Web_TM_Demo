package Dao;

/**
 * Created by Administrator on 2016/1/7.
 */
public class PTM_Article {
    private int article_id;
    private String source_lang;
    private String target_lang;
    private int[] translators;
    private int[] ptm_sentences;
    private String provenience;
    private String[] external_translators;
    private double ranking;

    public PTM_Article(int article_id, String source_lang, String target_lang,
                       int[] translators, int[] ptm_sentences, String provenience,
                       String[] external_translators, double ranking) {
        this.article_id = article_id;
        this.source_lang = source_lang;
        this.target_lang = target_lang;
        this.translators = translators;
        this.ptm_sentences = ptm_sentences;
        this.provenience = provenience;
        this.external_translators = external_translators;
        this.ranking = ranking;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
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

    public int[] getTranslators() {
        return translators;
    }

    public void setTranslators(int[] translators) {
        this.translators = translators;
    }

    public int[] getPtm_sentences() {
        return ptm_sentences;
    }

    public void setPtm_sentences(int[] ptm_sentences) {
        this.ptm_sentences = ptm_sentences;
    }

    public String getProvenience() {
        return provenience;
    }

    public void setProvenience(String provenience) {
        this.provenience = provenience;
    }

    public String[] getExternal_translators() {
        return external_translators;
    }

    public void setExternal_translators(String[] external_translators) {
        this.external_translators = external_translators;
    }
}
