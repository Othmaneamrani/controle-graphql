package org.example.controlegraphql.dao;

import org.example.controlegraphql.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book,Integer> {

    List<Book> getBookByTitle(String title);

}
