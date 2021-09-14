package com.example.springjpademo.controller;


import com.example.springjpademo.entities.Book;
import com.example.springjpademo.entities.Story;
import com.example.springjpademo.service.Interface.IStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/story")
public class StoryController {
    @Autowired
    IStoryService iStoryService;

    @RequestMapping(value = "/savestory",method = RequestMethod.POST)
    @ResponseBody
    public Story saveBook(@RequestBody Story story) {
        Story storyResponse = iStoryService.saveStory(story);
        return storyResponse;
    }
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deleteBookByID(@PathVariable int id) {
        Integer storyResponse =  iStoryService.deleteStoryByID(id);
        return storyResponse;
    }
}
