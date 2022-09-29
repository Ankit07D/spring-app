package com.demo.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/getbook")
    public Book getBook() {
        return new Book(1, "Name1", "Title1");
    }
	
	@PostMapping("/savebook")
    public Book addBook(@RequestBody Book book) {
		return new Book(2, "Name2", "Title2");
    }
}
