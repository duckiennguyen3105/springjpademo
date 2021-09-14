package com.example.springjpademo.entities;

import javax.persistence.*;

@Entity
public class Story{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "story_name")
    private String storyName;
//
    @ManyToOne(fetch= FetchType.LAZY,cascade = {CascadeType.PERSIST})
    private Book book;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }
}