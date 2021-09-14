package com.example.springjpademo.controller;

import com.example.springjpademo.entities.Book;
import com.example.springjpademo.service.BookService;
import com.example.springjpademo.service.Interface.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private IBookService bookService;


    @RequestMapping(value = "/savebook",method = RequestMethod.POST)
    @ResponseBody
    public Book saveBook(@RequestBody Book book) {
        Book bookResponse = bookService.saveBook(book);
        return bookResponse;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public Book updateBook(@RequestBody Book book) {
        Book bookResponse = (Book) bookService.saveBook(book);
        return bookResponse;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Book deleteBook(@RequestBody Book book) {
        Book bookResponse = (Book) bookService.deleteBook(book);
        return bookResponse;
    }
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deleteBookByID(@PathVariable int id) {
        Integer bookResponse =  bookService.deleteBookByID(id);
        return bookResponse;
    }

    @RequestMapping(value = "/{bookId}",method = RequestMethod.GET)
    @ResponseBody
    public Book getBookDetails(@PathVariable int bookId) {
        Book bookResponse = bookService.findByBookId(bookId);

        return bookResponse;
    }


}
