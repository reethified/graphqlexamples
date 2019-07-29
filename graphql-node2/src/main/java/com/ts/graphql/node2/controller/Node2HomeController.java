package com.ts.graphql.node2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Node2HomeController {
    @RequestMapping("/")
    public String index() {
        return "Hello Node 2";
    }
}
