package com.api.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Component
public class BookService {

	/*
	private static List<Book> list=new ArrayList<>();
	
	static {
		list.add(new Book(12,"Java Complete Reference","Bivek Jha"));
		list.add(new Book(13,"C++ Complete Reference","Vinay Jha"));
		list.add(new Book(14,"C Complete Reference","Aarti Jha"));
		list.add(new Book(15,"SQL Complete Reference","Vartika Jha"));
	}
	*/
	
	private BookRepository bookRepository;
	//Get all book
	public List<Book> getAllBooks()
	{
		List<Book> list=(List<Book>)this.bookRepository.findAll();
		
		return list;
	}
	
	//get single book by id
	
	public Book getBookById(int id)
	{
		Book book=null;
		//book=list.stream().filter(e->e.getId()==id).findFirst().get();
		
		try {
			 
			book=this.bookRepository.findById(id);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return book;
	}
	
	//Adding the book
	
	public Book addBook(Book b)
	{
		//list.add(b);
		
		Book result=this.bookRepository.save(b);
		return result;
	}
	
	//Deleting book
	public void deleteBook(int bid)
	{
		//list=list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
		
		this.bookRepository.deleteById(bid);
	}
	
	//Update Book
	public void updateBook(Book book, int bid)
	{
		/*
		list=list.stream().map(b->{
			if(b.getId()==bid)
			{
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
		*/
		
		book.setId(bid);
		this.bookRepository.save(book);
	}
}
