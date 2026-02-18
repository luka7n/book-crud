package com.book.bookcrud.service;

import com.book.bookcrud.dto.BookCreateRequest;
import com.book.bookcrud.dto.BookResponse;
import com.book.bookcrud.entity.Book;
import com.book.bookcrud.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public BookResponse create(BookCreateRequest request) {
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setPublishYear(request.getPublishYear());

        Book saved = bookRepository.save(book);
        return toResponse(saved);
    }

    @Override
    public List<BookResponse> getAll() {
        return bookRepository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    @Override
    public BookResponse getById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found: " + id));
        return toResponse(book);
    }

    @Override
    public BookResponse update(Long id, BookCreateRequest request) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found: " + id));

        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setPublishYear(request.getPublishYear());

        Book saved = bookRepository.save(book);
        return toResponse(saved);
    }

    @Override
    public void delete(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new RuntimeException("Book not found: " + id);
        }
        bookRepository.deleteById(id);
    }

    private BookResponse toResponse(Book book) {
        BookResponse res = new BookResponse();
        res.setId(book.getId());
        res.setTitle(book.getTitle());
        res.setAuthor(book.getAuthor());
        res.setPublishYear(book.getPublishYear());
        return res;
    }
}
