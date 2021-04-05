package com.partola.security.oauth2.book.service;

import com.partola.security.oauth2.book.entity.Book;
import com.partola.security.oauth2.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class DefaultBookService implements BookService {
	
	private BookRepository bookRepository;
	
	@Override
	public Optional<Book> findById(String id) {
		return bookRepository.findById(id);
	}
	
	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	
	@Override
	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}
}
