package com.partola.security.oauth2.book.mapper;

import com.partola.security.oauth2.book.dto.BookDto;
import com.partola.security.oauth2.book.entity.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {
	
	BookDto convertToDto(Book book);
}
