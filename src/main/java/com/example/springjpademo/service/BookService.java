package com.example.springjpademo.service;


import com.example.springjpademo.entities.Book;
import com.example.springjpademo.entities.Story;
import com.example.springjpademo.repo.BookRepository;
import com.example.springjpademo.repo.StoryRepository;
import com.example.springjpademo.service.Interface.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Optional;

@Service
public class BookService implements IBookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private StoryRepository storyRepository;



    @Transactional
    public Book saveBook(Book book) {

//        for (Story story:
//        book.getStoryList()) {
//            story.setBook(book);
//        }
        book = bookRepository.save(book);

        return book;
    }

    @Transactional
    public Book deleteBook(Book book) {
        bookRepository.delete(book);
        return book;
    }
    @Transactional
    public int deleteBookByID(int id) {
        bookRepository.deleteAllById(Collections.singleton(Integer.valueOf(id)));
        return id;
    }

    public Book findByBookId(int bookId) {
        Optional<Book> bookResponse = bookRepository.findById(bookId);
        Book book = bookResponse.get();
        return book;
    }
}
