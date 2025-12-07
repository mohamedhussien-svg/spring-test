package com.spring.test;

import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringTestApplicationTests {

	@Test
	void contextLoads() {
        assertEquals(true,true);
	}

}
