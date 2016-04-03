package Service;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by sunjm on 2016/3/29.
 * client 管理的类
 * 目前的配置是索引至本地单一的服务器
 * 目前未使用此类，如需部署集群需要重新配置
 * 目前写在下面几个服务类的构造函数里面，都是本地的索引
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
