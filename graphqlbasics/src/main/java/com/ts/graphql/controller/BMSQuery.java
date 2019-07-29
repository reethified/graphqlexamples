package com.ts.graphql.controller;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.ts.graphql.model.Book;
import com.ts.graphql.service.BMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BMSQuery implements GraphQLQueryResolver {

    @Autowired
    BMSService bmsService;

    public List<Book> allBooks(){
       return bmsService.allBooks();
    }

}
