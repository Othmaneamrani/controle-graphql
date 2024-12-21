package org.example.controlegraphql.web;


import lombok.AllArgsConstructor;
import org.example.controlegraphql.dto.BookDTO;
import org.example.controlegraphql.service.IBookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookGraphqlController {

    private IBookService iBookService;

    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO bookDTO){
        return iBookService.saveBook(bookDTO);
    }


    @QueryMapping
    public List<BookDTO> getBookByTitle(@Argument String title){
        return iBookService.getBookByTitle(title);
    }


}
