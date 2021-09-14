package com.example.springjpademo.service.Interface;


import com.example.springjpademo.entities.Story;

public interface IStoryService {
    Story saveStory(Story story);
    int deleteStoryByID(int id);
}
