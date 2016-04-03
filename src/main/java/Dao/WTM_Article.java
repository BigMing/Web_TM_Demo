package Dao;

import java.util.Date;

/**
 * Created by sunjm on 2016/3/29.
 */
public class WTM_Article {
    private int article_id;
    private int project_id;
    private Date last_p_time;
    private Date last_t_time;
    private int[] translators;
    private int[] proofreaders;
    private int[] wtm_sentences;
    private String source_lang;
    private String target_lang;
    private int[] wtm_paragraphs;
    private int status;
    private String[] tags;
    private String provenience;

    public WTM_Article(int article_id, int project_id, Date last_p_time, Date last_t_time,
                       int[] translators, int[] proofreaders, int[] wtm_sentences, String source_lang,
                       String target_lang, int[] wtm_paragraphs, int status, String[] tags, String provenience) {
        this.article_id = article_id;
        this.project_id = project_id;
        this.last_p_time = last_p_time;
        this.last_t_time = last_t_time;
        this.translators = translators;
        this.proofreaders = proofreaders;
        this.wtm_sentences = wtm_sentences;
        this.source_lang = source_lang;
        this.target_lang = target_lang;
        this.wtm_paragraphs = wtm_paragraphs;
        this.status = status;
        this.tags = tags;
        this.provenience = provenience;
    }

    public String getProvenience() {
        return provenience;
    }

    public void setProvenience(String provenience) {
        this.provenience = provenience;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public Date getLast_p_time() {
        return last_p_time;
    }

    public void setLast_p_time(Date last_p_time) {
        this.last_p_time = last_p_time;
    }

    public Date getLast_t_time() {
        return last_t_time;
    }

    public void setLast_t_time(Date last_t_time) {
        this.last_t_time = last_t_time;
    }

    public int[] getTranslators() {
        return translators;
    }

    public void setTranslators(int[] translators) {
        this.translators = translators;
    }

    public int[] getProofreaders() {
        return proofreaders;
    }

    public void setProofreaders(int[] proofreaders) {
        this.proofreaders = proofreaders;
    }

    public int[] getWtm_sentences() {
        return wtm_sentences;
    }

    public void setWtm_sentences(int[] wtm_sentences) {
        this.wtm_sentences = wtm_sentences;
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

    public int[] getWtm_paragraphs() {
        return wtm_paragraphs;
    }

    public void setWtm_paragraphs(int[] wtm_paragraphs) {
        this.wtm_paragraphs = wtm_paragraphs;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
