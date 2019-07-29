package com.ts.graphql.node2.controller;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Node2Query implements GraphQLQueryResolver {
    public String node2Hi(String message){
        return String.format("Hello:%s",message);
    }


}