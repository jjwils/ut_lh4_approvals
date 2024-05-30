package train.the.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NumberFetcherServiceClient {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${serviceClients.numbers.baseUrl}")
    private String baseUrl;
    public Numbers fetchNumbers() {
        return restTemplate.getForObject(baseUrl + "/numbers", Numbers.class);

    }

}
