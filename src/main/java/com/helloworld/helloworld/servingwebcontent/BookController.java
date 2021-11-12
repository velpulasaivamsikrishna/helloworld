package com.helloworld.helloworld.servingwebcontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helloworld.helloworld.entity.Books;
import com.helloworld.helloworld.service.BookService;


@RestController
public class BookController {
    @Autowired BookService service;

    @GetMapping("/books")
    public List<Books> getBooks() {
    	System.out.println(service.getBooks());
        return service.getBooks();
    }

    @PostMapping("/books/add")
    public void postBooks(@RequestBody Books dto) {
        service.add(dto);
    } 
    @GetMapping("/name/{name}")
    public List<Books> getByName(@PathVariable(required = true) String name) {
    return service.findByName(name);
    }



    @GetMapping("/{id}")
    public Books getById(@PathVariable(required = true) long id) {
    return service.getBookById(id);
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
    service.delete(id);
    }
}
