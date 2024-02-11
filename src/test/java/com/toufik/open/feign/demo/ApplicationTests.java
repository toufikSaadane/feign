package com.toufik.open.feign.demo;

import com.toufik.open.feign.demo.service.Data;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

    ServerProperties serverProperties;
    @Mock
    Data client;


    @Test
    void getSome() {
//            client.getStockData().stream().findFirst().ifPresent(System.out::println);
//            assertThat(client.getStockData().get(0).getSymbol()).isEqualTo("AA");
        assertThat(client.getStocks().size()).isGreaterThan(0);
    }
}
