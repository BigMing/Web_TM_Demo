package Dao;

/**
 * Created by Administrator on 2016/1/7.
 */
public class WTM_Paragraph {
    private int para_id;
    private int article_id;
    private int[] sentences;
    private int translator_id;
    private int proofreader_id;

    public WTM_Paragraph(int para_id, int article_id, int[] sentences, int translator_id, int proofreader_id) {
        this.para_id = para_id;
        this.article_id = article_id;
        this.sentences = sentences;
        this.translator_id = translator_id;
        this.proofreader_id = proofreader_id;
    }

    public int getPara_id() {
        return para_id;
    }

    public void setPara_id(int para_id) {
        this.para_id = para_id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int[] getSentences() {
        return sentences;
    }

    public void setSentences(int[] sentences) {
        this.sentences = sentences;
    }

    public int getTranslator_id() {
        return translator_id;
    }

    public void setTranslator_id(int translator_id) {
        this.translator_id = translator_id;
    }

    public int getProofreader_id() {
        return proofreader_id;
    }

    public void setProofreader_id(int proofreader_id) {
        this.proofreader_id = proofreader_id;
    }
}
