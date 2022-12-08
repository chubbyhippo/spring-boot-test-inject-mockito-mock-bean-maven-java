package com.example.demo.config;

import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import static org.mockito.Mockito.mock;

@Configuration
public class HelloServiceTestConfig {
    @Bean
    @Primary
    public HelloService getMockHelloService() {
        return mock(HelloService.class);
    }
}
