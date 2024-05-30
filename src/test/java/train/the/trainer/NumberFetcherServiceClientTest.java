package train.the.trainer;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@SpringBootTest
@WireMockTest(httpPort = 9000)
public class NumberFetcherServiceClientTest {

    @Autowired
    private NumberFetcherServiceClient numberFetcherServiceClient;

    @Test
    void fetch_numbers() {

        stubFor(get(urlPathEqualTo("/numbers"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("""
                                {
                                  "sequence": [
                                    6, 2, 8, 13, 18, 10, 3, 15, 9, 5, 4, 7, 19, 17, 16, 11, 12, 14, 1, 20
                                  ]
                                }
                                """)
                ));


        Numbers numbers = numberFetcherServiceClient.fetchNumbers();

        assertThat(numbers, is(equalTo(
                new Numbers(
                        Arrays.asList(6, 2, 8, 13, 18, 10, 3, 15, 9, 5, 4, 7, 19, 17, 16, 11, 12, 14, 1, 20)))));

    }
}

