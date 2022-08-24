package com.example.springjpademo.service;

import com.example.springjpademo.entities.User;
import com.example.springjpademo.exception.MailNotFoundException;
import com.example.springjpademo.repo.UserRepository;
import com.example.springjpademo.service.Interface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository repository;

    @Override
    public List<User> getUserName(String name) {
        List<User> user = repository.findByName(name);
        return user;
    }

    @Override
    public List<User> getTop5UserOrderByID() {
        List<User> user = repository.findTop5ByOrderById();
        return user;
    }

//    @Override
//    public User getUserByMail(String mail) throws MailNotFoundException{
//        User user = repository.findByEmail(mail).orElseThrow(() -> {
//            throw new MailNotFoundException("Khong tim thay " + mail);
//        });
//        return user;
//    }

    @Override
    public List<User> getAllWithSort() {
        List<User> userList = repository.findAll(Sort.by("id").descending());
        return userList;
    }


}
