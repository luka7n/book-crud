package com.book.bookcrud.service;

import com.book.bookcrud.dto.BookCreateRequest;
import com.book.bookcrud.dto.BookResponse;

import java.util.List;

public interface BookService {
    BookResponse create(BookCreateRequest request);
    List<BookResponse> getAll();
    BookResponse getById(Long id);
    BookResponse update(Long id, BookCreateRequest request);
    void delete(Long id);
}
