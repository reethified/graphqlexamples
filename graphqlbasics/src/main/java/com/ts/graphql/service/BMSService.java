package com.ts.graphql.service;

import com.ts.graphql.model.Book;
import com.ts.graphql.repository.BookRespository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class BMSService {

    private static final Logger LOGGER = LogManager.getLogger(BMSService.class);

    @Autowired
    BookRespository bookRespository;

    public Book getBookByISBN(String isbn){
        LOGGER.debug("Fetching book by isbn:{}",isbn);
      return   bookRespository.getOne(isbn);

    }
    public void save(Book book){
        LOGGER.debug("Persisting book:{}",book);
        bookRespository.save(book);

    }

    public List<Book> allBooks(){
       return  bookRespository.findAll();

    }

}
