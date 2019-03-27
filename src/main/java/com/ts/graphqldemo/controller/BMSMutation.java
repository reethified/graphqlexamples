package com.ts.graphqldemo.controller;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.ts.graphqldemo.model.Book;
import com.ts.graphqldemo.service.BMSService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class BMSMutation implements GraphQLMutationResolver {
    private static final Logger LOGGER = LogManager.getLogger(BMSMutation.class);

    @Autowired
    BMSService service;

    SimpleDateFormat sdf;
    public BMSMutation(){
        sdf = new SimpleDateFormat("yyyy-MM-dd");
    }
    public Boolean save( String isbn, String title,String pubYear, int price) throws ParseException {
        Book book = new Book();
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setPubYear(sdf.parse(pubYear));
        book.setPrice(price);
        try {
            service.save(book);
            return true;
        }catch (Exception e){
            LOGGER.error(e);
            return false;
        }
    }
}
