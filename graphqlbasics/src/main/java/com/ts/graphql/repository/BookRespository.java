package com.ts.graphql.repository;


import com.ts.graphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespository extends JpaRepository<Book, String > {
}
