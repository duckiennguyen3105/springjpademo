package com.example.springjpademo.service.Interface;

import com.example.springjpademo.entities.Book;

public interface IBookService {
     Book saveBook(Book book);
     Book findByBookId(int bookId);
     Book deleteBook(Book book);
     int deleteBookByID(int id);
}
