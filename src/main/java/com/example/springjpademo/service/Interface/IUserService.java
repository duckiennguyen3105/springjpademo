package com.example.springjpademo.service.Interface;

import com.example.springjpademo.entities.User;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IUserService {
    List<User> getUserName(String name);
    List<User> getTop5UserOrderByID();
    User getUserByMail(String mail);
    List<User> getAllWithSort();
}
