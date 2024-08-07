package com.org.md.springbootApiMongoDb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	private BookService service;
	
	@GetMapping("/findBooks")
	public List<Book> getBooks(){
		return service.showAllBooks();
		
	}
	@PostMapping("/addbook")
	public String saveBook(@RequestBody Book book) {
		return service.createBook(book);
		
	}
	@PutMapping("/updateBook/{id}")
	public String updateBook(@PathVariable int id,@RequestBody Book book) {
		service.updateBook(id, book);
		return "Book updated";
	}
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		service.deleteById(id);
		return "Deleted";
		
	}
	
	

}
