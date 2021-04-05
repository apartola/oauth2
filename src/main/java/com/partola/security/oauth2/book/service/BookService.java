package com.partola.security.oauth2.book.service;

import com.partola.security.oauth2.book.entity.Book;

import java.util.Optional;

public interface BookService {
	
	Optional<Book> findById(String id);
	
	Book save(Book book);
	
	Iterable<Book> findAll();
}
