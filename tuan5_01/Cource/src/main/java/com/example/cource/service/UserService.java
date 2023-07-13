package com.example.cource.service;

import com.example.cource.model.Course;
import com.example.cource.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User save(User user);
    User findByID(Long id);
    List<User> findAll();
    void delete(Long id);
}
