package com.ts.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ts.graphql.*",
		"com.ts.graphql.controller.*",
		"com.ts.graphql.model.*" ,
		"com.ts.graphql.service.*",
"com.ts.graphqldemo.repository.*"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}

