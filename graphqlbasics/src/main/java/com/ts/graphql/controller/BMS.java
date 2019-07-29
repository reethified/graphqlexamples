package com.ts.graphql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMS {
    @RequestMapping("/")
    public String index(){
        return "Hello BMS";
    }
}
