package Service;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by sunjm on 2016/3/29.
 */
public class ClientService {
    Client client;

    public Client initLocalClient(){
        try {
            client = TransportClient.builder().build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"),9300));
            return client;
        }catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void closeClien(){
        client.close();
    }

/*    public SearchService(){
        client = new TransportClient().addTransportAddress(
                new InetSocketTransportAddress("localhost",9300)
        );
    }*/
}
