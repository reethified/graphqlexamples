package com.ts.graphqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.ts.graphqldemo.*",
		"com.ts.graphqldemo.controller.*",
		"com.ts.graphqldemo.model.*" ,
		"com.ts.graphqldemo.service.*",
"com.ts.graphqldemo.repository.*"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}

