package com.ts.graphql.node2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ts.graphql.node2.*",
		"com.ts.graphql.node2.controller.*"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}

