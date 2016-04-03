package Service;

import Dao.*;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;

import java.io.IOException;

/**
 * Created by Administrator on 2016/1/10.
 */
public class JsonService {
    public String generateProject(Project project){
        String json = "";
        try {
            XContentBuilder contentBuilder = XContentFactory.jsonBuilder().startObject();
            contentBuilder.field("project_id",project.getProject_id())
                    .field("articles",project.getArticles())
                    .field("translators",project.getTranslators())
                    .field("proofreaders",project.getProofreaders());
            json = contentBuilder.endObject().string();
        }catch (IOException e){
            e.printStackTrace();
        }
        return json;
    }

    public String generatePTM_Article (PTM_Article ptm_article){
        String json = "";
        try {
            XContentBuilder contentBuilder = XContentFactory.jsonBuilder().startObject();
            contentBuilder.field("article_id",ptm_article.getArticle_id())
                    .field("source_lang",ptm_article.getSource_lang())
                    .field("target_lang",ptm_article.getTarget_lang())
                    .field("translators",ptm_article.getTranslators())
                    .field("provenience",ptm_article.getProvenience())
                    .field("ranking",ptm_article.getRanking())
                    .field("ptm_sentences",ptm_article.getPtm_sentences())
                    .field("external_translators",ptm_article.getExternal_translators());
            json = contentBuilder.endObject().string();
        }catch (IOException e){
            e.printStackTrace();
        }
        return json;
    }

    public String generatePTM_Sentence(PTM_Sentence ptm_sentence){
        String json = "";
        try {
            XContentBuilder contentBuilder = XContentFactory.jsonBuilder().startObject();
            contentBuilder.field("sid",ptm_sentence.getSid())
                    .field("article_id",ptm_sentence.getArticle_id())
                    .field("source_lang",ptm_sentence.getSource_lang())
                    .field("target_lang",ptm_sentence.getTarget_lang())
                    .field("source_sentence",ptm_sentence.getSource_sentence())
                    .field("target_sentence",ptm_sentence.getTarget_sentence())
                    .field("translator",ptm_sentence.getTranslator())
                    .field("provenience",ptm_sentence.getProvenience())
                    .field("ranking",ptm_sentence.getRanking())
                    .field("remark",ptm_sentence.getRemark());
            json = contentBuilder.endObject().string();
        }catch (IOException e){
            e.printStackTrace();
        }
        return json;
    }

    public String generateUser(User user){
        String json = "";
        try {
            XContentBuilder contentBuilder = XContentFactory.jsonBuilder().startObject();
            contentBuilder.field("user_id",user.getUser_id())
                    .field("user_name",user.getUser_name())
                    .field("password",user.getPassword())
                    .field("registration_time",user.getRegistration_time())
                    .field("projects",user.getProjects());
            json = contentBuilder.endObject().string();
        }catch (IOException e){
            e.printStackTrace();
        }
        return json;
    }

    public String generateWTM_Article(WTM_Article wtm_article){
        String json = "";
        try {
            XContentBuilder contentBuilder = XContentFactory.jsonBuilder().startObject();
            contentBuilder.field("project_id",wtm_article.getProject_id())
                    .field("article_id",wtm_article.getArticle_id())
                    .field("translators",wtm_article.getTranslators())
                    .field("proofreaders",wtm_article.getProofreaders())
                    .field("last_t_time",wtm_article.getLast_t_time())
                    .field("last_p_time",wtm_article.getLast_p_time())
                    .field("provenience",wtm_article.getProvenience())
                    .field("wtm_sentences",wtm_article.getWtm_sentences())
                    .field("source_lang",wtm_article.getSource_lang())
                    .field("target_lang",wtm_article.getTarget_lang())
                    .field("tags",wtm_article.getTags())
                    .field("wtm_paragraphs",wtm_article.getWtm_paragraphs());
            json = contentBuilder.endObject().string();
        }catch (IOException e){
            e.printStackTrace();
        }
        return json;
    }

    public String generateWTM_Paragraph(WTM_Paragraph wtm_paragraph){
        String json = "";
        try {
            XContentBuilder contentBuilder = XContentFactory.jsonBuilder().startObject();
            contentBuilder.field("para_id",wtm_paragraph.getPara_id())
                    .field("article_id",wtm_paragraph.getArticle_id())
                    .field("sentences",wtm_paragraph.getSentences())
                    .field("translator_id",wtm_paragraph.getTranslator_id())
                    .field("proofreader_id",wtm_paragraph.getProofreader_id());
            json = contentBuilder.endObject().string();
        }catch (IOException e){
            e.printStackTrace();
        }
        return json;
    }

    public String generateWTM_Sentence(WTM_Sentence wtm_sentence){
        String json = "";
        try {
            XContentBuilder contentBuilder = XContentFactory.jsonBuilder().startObject();
            contentBuilder.field("sid",wtm_sentence.getSid())
                    .field("article_id",wtm_sentence.getArticle_id())
                    .field("para_id",wtm_sentence.getPara_id())
                    .field("text",wtm_sentence.getText())
                    .field("remark",wtm_sentence.getRemark());
            json = contentBuilder.endObject().string();
        }catch (IOException e){
            e.printStackTrace();
        }
        return json;
    }

    public String generateWTM_Translation(WTM_Translation wtm_translation){
        String json = "";
        try {
            XContentBuilder contentBuilder = XContentFactory.jsonBuilder().startObject();
            contentBuilder.field("article_id",wtm_translation.getArticle_id())
                    .field("sid",wtm_translation.getSid())
                    .field("para_id",wtm_translation.getPara_id())
                    .field("text",wtm_translation.getText())
                    .field("status",wtm_translation.getStatus())
                    .field("last_t_time",wtm_translation.getLast_t_time())
                    .field("last_p_time",wtm_translation.getLast_p_time());
            json = contentBuilder.endObject().string();
        }catch (IOException e){
            e.printStackTrace();
        }
        return json;
    }
}
