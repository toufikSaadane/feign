package com.toufik.open.feign.demo.service;

import com.toufik.open.feign.demo.config.ServerProperties;
import com.toufik.open.feign.demo.model.Stock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Data {

    private final ServerProperties serverProperties;

    public Data(ServerProperties serverProperties) {
        this.serverProperties = serverProperties;
    }

    public List<Stock> getStocks(){
        CoinloreClient   client = FeignClientBuilder.getClient(CoinloreClient.class,
                serverProperties.getApi().get("url"));

        client.getStockData().stream().findFirst().ifPresent(System.out::println);

        return client.getStockData();
    }
}
