package com.ts.graphqldemo.repository;


import com.ts.graphqldemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface BookRespository extends JpaRepository<Book, String > {
}
