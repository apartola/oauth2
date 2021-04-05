package com.partola.security.oauth2.book.controller;

import com.partola.security.oauth2.book.dto.BookDto;
import com.partola.security.oauth2.book.entity.Book;
import com.partola.security.oauth2.book.mapper.BookMapper;
import com.partola.security.oauth2.book.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
	
	private BookService bookService;
	
	private BookMapper bookMapper;
	
	@GetMapping("/{id}")
	public BookDto findOne(@PathVariable String id) {
		Book entity = bookService.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		return bookMapper.convertToDto(entity);
	}
	
	@GetMapping
	public Collection<BookDto> findAll() {
		final Iterable<Book> books = bookService.findAll();
		List<BookDto> resultList = new LinkedList<>();
		books.forEach(book -> resultList.add(bookMapper.convertToDto(book)));
		return resultList;
	}
	
}
