package com.example.springjpademo.controller;


import com.example.springjpademo.entities.User;
import com.example.springjpademo.exception.MailNotFoundException;
import com.example.springjpademo.service.Interface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService iUserService;

    @GetMapping("/getUserByName/{name}")
    public List<User> getUserByName(@PathVariable("name") String name){
        List<User> userList = iUserService.getUserName(name);
        return userList;

    }

    @GetMapping("/getTop5UserById")
    public ResponseEntity<?> getTop5UserById(){
        List<User> userList = iUserService.getTop5UserOrderByID();
        return new ResponseEntity(userList, HttpStatus.OK);

    }

//    @GetMapping("/getUserByMail/{mail}")
//    public ResponseEntity<?> getUserByMail(@PathVariable("mail") String mail){
//        try {
//            User user = iUserService.getUserByMail(mail);
//            return ResponseEntity.ok(user);
//        }catch (MailNotFoundException mailNotFoundException){
//            return new ResponseEntity<>(mailNotFoundException.getMessage(),HttpStatus.BAD_REQUEST);
//        }
//    }

    @GetMapping("/getAllUserWithSort")
    public ResponseEntity<?> getAllUserWithSort(){
        List<User> userList = iUserService.getAllWithSort();
        return ResponseEntity.ok(userList);
    }


}
