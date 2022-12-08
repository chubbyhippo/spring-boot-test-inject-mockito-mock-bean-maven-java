package com.example.demo;

import com.example.demo.service.HelloService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private HelloService helloService;
	@Test
	void shouldGetHelloFromMockService() {
		when(helloService.getHello()).thenReturn("Hello from mock");
		var hello = helloService.getHello();
		Assertions.assertThat(hello).isEqualTo("Hello from mock");
	}

}
