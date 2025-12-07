package com.spring.test;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringTestApplication {

	public static void main(String[] args) {
		log.info("main :- Spring Boot Application Started");
        SpringApplication.run(SpringTestApplication.class, args);
	}
    @PostConstruct
    public void postConstruct(){
        log.info("postConstruct :- Spring Boot Application Started");

    }

}
