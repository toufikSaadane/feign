package com.toufik.open.feign.demo.service;

import com.toufik.open.feign.demo.model.Stock;
import feign.RequestLine;

import java.util.List;

public interface CoinloreClient {
    @RequestLine("GET")
    List<Stock> getStockData();
}
