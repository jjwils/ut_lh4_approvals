package train.the.trainer;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@WireMockTest
public class PrinterServiceIntegrationTest {

    @Test
    void print(){
        stubFor(get(urlPathEqualTo("/job"))
                .willReturn(status(200)));

    }



}
