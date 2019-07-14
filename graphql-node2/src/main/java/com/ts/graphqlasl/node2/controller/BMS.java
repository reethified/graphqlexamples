package com.ts.graphqlasl.node2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMS {
    @RequestMapping("/")
    public String index() {
        return "Hello Node 2";
    }
}
