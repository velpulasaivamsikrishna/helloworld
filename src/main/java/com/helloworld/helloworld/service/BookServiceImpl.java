package com.helloworld.helloworld.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.helloworld.dao.BookRepository;
import com.helloworld.helloworld.entity.Books;
import com.helloworld.helloworld.exception.BookNotFoundException;



@Service
public class BookServiceImpl implements BookService {
@Autowired
private BookRepository repository;
public List<Books> getBooks() {
return (List<Books>) repository.findAll();
}
public void add(Books dto) {
repository.save(dto);
} @Override
public void delete(long id) {
repository.deleteById(id);
} @Override
public List<Books> findByName(String name) {
// TODO Auto-generated method stub
return repository.findByName(name);
} @Override
public Books getBookById(long id) {
// TODO Auto-generated method stub
Optional<Books> optionalBook = repository.findById(id);
return optionalBook.orElseThrow(() -> new BookNotFoundException("Couldn't find a Book with id: " + id));
}
}

