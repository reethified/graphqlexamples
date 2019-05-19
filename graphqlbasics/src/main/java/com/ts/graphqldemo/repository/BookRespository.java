package com.ts.graphqldemo.repository;


import com.ts.graphqldemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespository extends JpaRepository<Book, String > {
}
