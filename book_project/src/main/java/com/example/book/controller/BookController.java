package com.example.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.book.dto.BookDTO;
import com.example.book.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(BookDTO bookDTO) {
		System.out.println("BookDTO = " + bookDTO);
		bookService.save(bookDTO);
		return "list";
	}
}







