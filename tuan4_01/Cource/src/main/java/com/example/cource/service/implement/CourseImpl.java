package com.example.cource.service.implement;

import com.example.cource.model.Course;
import com.example.cource.repository.CourseRepository;
import com.example.cource.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CourseImpl implements CourseService {
    @Autowired
    private CourseRepository repository;
    @Override
    public Course save(Course course) {
        return repository.save(course);
    }

    @Override
    public Course findByID(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
