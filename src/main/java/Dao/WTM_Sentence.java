package Dao;

/**
 * Created by sunjm on 2016/3/29.
 */
public class WTM_Sentence {
    private int sid;
    private int article_id;
    private int para_id;
    private String text;
    private String remark;

    public WTM_Sentence(int sid, int article_id, int para_id, String text, String remark) {
        this.sid = sid;
        this.article_id = article_id;
        this.para_id = para_id;
        this.text = text;
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

    public int getPara_id() {
        return para_id;
    }

    public void setPara_id(int para_id) {
        this.para_id = para_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
