package com.partola.security.oauth2.book.repository;

import com.partola.security.oauth2.book.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepository extends PagingAndSortingRepository<Book, String> {
}
