package com.toufik.open.feign.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "server")
public class ServerProperties {
    private Map<String, String> api;
}
