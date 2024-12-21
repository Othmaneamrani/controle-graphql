package org.example.controlegraphql.service;

import org.example.controlegraphql.dto.BookDTO;
import org.example.controlegraphql.entities.Book;

import java.util.List;

public interface IBookService {


    BookDTO saveBook(BookDTO bookDTO);

    List<BookDTO> getBookByTitle(String title);
}
