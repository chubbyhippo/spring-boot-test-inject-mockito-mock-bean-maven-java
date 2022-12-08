package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloServiceTest {

    private final HelloService helloService = new HelloService();

    @Test
    void shouldGetHello() {
        var hello = helloService.getHello();
        assertThat(hello).isEqualTo("hello");
    }
}