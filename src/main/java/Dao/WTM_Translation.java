package Dao;

import java.util.Date;

/**
 * Created by Administrator on 2016/1/7.
 */
public class WTM_Translation {
    private int article_id;
    private int sid;
    private int para_id;
    private String text;
    private int status;
    private Date last_t_time;
    private Date last_p_time;

    public WTM_Translation(int article_id, int sid, int para_id, String text, int status, Date last_t_time, Date last_p_time) {
        this.article_id = article_id;
        this.sid = sid;
        this.para_id = para_id;
        this.text = text;
        this.status = status;
        this.last_t_time = last_t_time;
        this.last_p_time = last_p_time;
    }

    public Date getLast_p_time() {
        return last_p_time;
    }

    public void setLast_p_time(Date last_p_time) {
        this.last_p_time = last_p_time;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getLast_t_time() {
        return last_t_time;
    }

    public void setLast_t_time(Date last_t_time) {
        this.last_t_time = last_t_time;
    }
}
