package com.example.cource.service.implement;

import com.example.cource.model.User;
import com.example.cource.repository.UserRepository;
import com.example.cource.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserImpl implements UserService {
    private UserRepository repository;
    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User findByID(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
