package com.book.bookcrud.dto;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class BookCreateRequest {

    @NotBlank
    private String title;
    @NotBlank
    private String author;
    @NotBlank
    private Integer publishYear;
}
