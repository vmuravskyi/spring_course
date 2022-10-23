package com.muravskyi.rest.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.muravskyi.rest.client")
public class TheConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
