package com.example.remoteapi;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class RemoteApiConfiq {
    @Bean
    public RestTemplate getRestTemp(RestTemplateBuilder rtb){
        return rtb.build();
    }
}
