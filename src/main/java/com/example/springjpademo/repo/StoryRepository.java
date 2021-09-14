package com.example.springjpademo.repo;


import com.example.springjpademo.entities.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StoryRepository extends CrudRepository<Story, Integer> {

}
