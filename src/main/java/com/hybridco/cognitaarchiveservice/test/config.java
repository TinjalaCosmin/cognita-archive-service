package com.hybridco.cognitaarchiveservice.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public Service service() {
        return new Service();
    }
}
