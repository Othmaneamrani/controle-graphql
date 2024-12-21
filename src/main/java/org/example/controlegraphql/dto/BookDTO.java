package org.example.controlegraphql.dto;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private int id_book;
    private String title;
    private String author;
    private String type;
    private double price;
    private String ISBN;
}
