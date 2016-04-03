package Service;

import org.elasticsearch.client.Client;
import org.junit.Test;

/**
 * Created by sunjm on 2016/4/1.
 */
public class ClientServiceTest {
    ClientService clientService = new ClientService();
    @Test
    public void initLocalClient() throws Exception {
        Client client = clientService.initLocalClient();
    }

    @Test
    public void closeClien() throws Exception {

    }

}