package com.example.springjpademo.repo;
import java.io.Serializable;

import com.example.springjpademo.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
     Book findByBookId(int bookId);
}
