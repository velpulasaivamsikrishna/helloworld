/**
 * 
 */
package com.helloworld.helloworld.service;

import java.util.List;

import com.helloworld.helloworld.entity.Books;

/**
 * @author admi
 *
 */
public interface BookService {
	public List<Books> getBooks();
	public void add(Books books); 
	
	public void delete(long id);
	
	public List<Books> findByName(String name);
	public Books getBookById(long id);
}
