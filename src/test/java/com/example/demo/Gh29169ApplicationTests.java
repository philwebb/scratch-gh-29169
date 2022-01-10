package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Gh29169ApplicationTests {

	@Autowired(required = false)
	private org.springframework.boot.web.servlet.error.ErrorAttributes errorAttributesServlet;

	@Autowired(required = false)
	private org.springframework.boot.web.reactive.error.ErrorAttributes errorAttributesReactive;

	@Test
	void contextLoads() {
		assertThat(this.errorAttributesServlet).isNull();
		assertThat(this.errorAttributesReactive).isNotNull();
	}

}