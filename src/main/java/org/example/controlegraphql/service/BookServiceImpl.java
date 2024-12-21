package org.example.controlegraphql.service;


import lombok.AllArgsConstructor;
import org.example.controlegraphql.dao.IBookRepository;
import org.example.controlegraphql.dto.BookDTO;
import org.example.controlegraphql.entities.Book;
import org.example.controlegraphql.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements  IBookService{


    private IBookRepository iBookRepository;
    private BookMapper bookMapper;


    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookMapper.fromBookDtoToBook(bookDTO);
        return bookMapper.fromBookToBookDto(iBookRepository.save(book));
    }

    @Override
    public List<BookDTO> getBookByTitle(String title) {
        List<Book> booksByTitle = iBookRepository.getBookByTitle(title);
        return bookMapper.fromListBookToListBookDto(booksByTitle);
    }
}
