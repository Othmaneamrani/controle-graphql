package org.example.controlegraphql.mapper;


import org.example.controlegraphql.dto.BookDTO;
import org.example.controlegraphql.entities.Book;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    public Book fromBookDtoToBook(BookDTO bookDTO){
        return modelMapper.map(bookDTO, Book.class);
    }

    public BookDTO fromBookToBookDto(Book book){
        return modelMapper.map(book, BookDTO.class);
    }
    public List<BookDTO> fromListBookToListBookDto(List<Book> bookList){
        List<BookDTO> bookDtoList = new ArrayList<>();
        for (Book book : bookList){
            BookDTO bookDto = modelMapper.map(book, BookDTO.class);
            bookDtoList.add(bookDto);
        }
        return bookDtoList;
    }

}
