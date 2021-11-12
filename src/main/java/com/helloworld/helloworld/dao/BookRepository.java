/**
 * 
 */
package com.helloworld.helloworld.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.helloworld.helloworld.entity.Books;

public interface BookRepository extends CrudRepository<Books, Long> {

	@Query(
			  value = "SELECT * FROM books WHERE name = ?1", 
			  nativeQuery = true)
    List<Books> findByName(String name);

}
