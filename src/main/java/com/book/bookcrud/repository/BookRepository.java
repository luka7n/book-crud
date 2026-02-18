package com.book.bookcrud.repository;

import com.book.bookcrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
