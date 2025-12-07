package com.spring.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class SpringTestApplicationTests {

	@Test
	public void contextLoads() {
        log.info("Test contextLoads");
        log.info("Test contextLoads 2nd Execution ******** ******* ******** ");
        assertEquals(true,true);
	}

}
