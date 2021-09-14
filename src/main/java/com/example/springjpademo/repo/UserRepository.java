package com.example.springjpademo.repo;

import com.example.springjpademo.entities.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByName(String name);
    Optional<User> findByEmail(String email);
    List<User> findAll(Sort sort);
    List<User> findTop5ByOrderById();
}
