package com.ts.graphqlasl.node2.graphqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ts.com.ts.graphqlasl.node2.graphqldemo.*",
		"com.ts.com.ts.graphqlasl.node2.graphqldemo.com.ts.graphqlasl.node2.controller.*",
		"com.ts.com.ts.graphqlasl.node2.graphqldemo.model.*" ,
		"com.ts.com.ts.graphqlasl.node2.graphqldemo.service.*",
"com.ts.com.ts.graphqlasl.node2.graphqldemo.repository.*"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}

