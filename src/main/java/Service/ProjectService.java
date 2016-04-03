package Service;

import Dao.Project;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by sunjm on 2016/3/30.
 */
public class ProjectService {
    public JsonService jsonService = new JsonService();
    //public ClientService clientService;
    public Client client;

    public ProjectService(){
        try {
            client = TransportClient.builder().build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"),9300)
                    );
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void Index_Project(Project project){
        IndexResponse response = client.prepareIndex("web_tm","project")
                .setSource(jsonService.generateProject(project))
                .get();
    }

}
