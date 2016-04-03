package Dao;

/**
 * Created by sunjm on 2016/3/29.
 */
public class Project {
    private int project_id;
    private int[] articles;
    private int[] translators;
    private int[] proofreaders;

    public Project(int project_id, int[] articles, int[] translators, int[] proofreaders) {
        this.project_id = project_id;
        this.articles = articles;
        this.translators = translators;
        this.proofreaders = proofreaders;
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

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int[] getArticles() {
        return articles;
    }

    public void setArticles(int[] articles) {
        this.articles = articles;
    }
}
