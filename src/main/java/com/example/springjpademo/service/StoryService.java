package com.example.springjpademo.service;

import com.example.springjpademo.entities.Book;
import com.example.springjpademo.entities.Story;
import com.example.springjpademo.repo.StoryRepository;
import com.example.springjpademo.service.Interface.IStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;


@Service
public class StoryService implements IStoryService {
    @Autowired
    StoryRepository storyRepository;

    @Transactional
    public Story saveStory(Story story) {
        story = storyRepository.save(story);
        return story;
    }

    @Override
    public int deleteStoryByID(int id) {
        storyRepository.deleteAllById(Collections.singleton(Integer.valueOf(id)));
        return id;
    }


}
