package com.toufik.open.feign.demo.model;

import lombok.Data;

@Data
public class Stock {
    public String symbol;
    public String name;
    public String currency;
    public String stockExchange;
    public String exchangeShortName;
}
