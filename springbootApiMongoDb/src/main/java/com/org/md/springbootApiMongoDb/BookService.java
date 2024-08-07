package com.org.md.springbootApiMongoDb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service

public class BookService {
	@Autowired
	private BookRepo bookrepo;
	
	
	public List<Book> showAllBooks(){
		return bookrepo.findAll();
	}
	public Optional<Book> getBookById(int id) {
		 return bookrepo.findById(id);
		
	}
	public Book updateBook(int id,Book book) {
		if(bookrepo.existsById(id)) {
			book.setId(id);
			return bookrepo.save(book);
		}
		return null;
		
	}
	public String createBook(Book book) {
		// TODO Auto-generated method stub
		bookrepo.insert(book);
		return "Added";
	}
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(id);
		
	}


}
