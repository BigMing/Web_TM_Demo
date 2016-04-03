package Service;

import Dao.User;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHits;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by sunjm on 2016/3/30.
 */
public class UserService {
    public JsonService jsonService = new JsonService();
    //public ClientService clientService;
    public Client client;

    public UserService(){
        try {
            client = TransportClient.builder().build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"),9300)
                    );
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    //输入user对象进行本地索引
    public void Index_User(User user){
        IndexResponse response = client.prepareIndex("web_tm","user")
                .setSource(jsonService.generateUser(user))
                .get();
    }

    //输入user对象进行密码匹配等操作，登陆用，未完成此函数
    public User checkUser(User user){
        SearchResponse response = client.prepareSearch("web_tm").setTypes("user")
                .setQuery(QueryBuilders.termQuery("user_name",user.getUser_name()))
                .execute().actionGet();
        SearchHits hits = response.getHits();
        if (hits.getTotalHits() != 0){
            String password = (String) hits.getAt(0).getSource().get("password");
            if (password == user.getPassword()){
                return (User)hits.getAt(0).getSource();
            }
        }
        return null;
    }
}
