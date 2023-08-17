package com.cloudvoid.darkskyz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class DarkSkyzTests {

	@Test
	void contextLoads() {
		var test = "test";
		assertThat(test).isEqualTo("test");
	}
}
