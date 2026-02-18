package com.book.bookcrud.dto;

import lombok.Data;

@Data
public class BookResponse {
    private Long id;
    private String title;
    private String author;
    private Integer publishYear;
}
