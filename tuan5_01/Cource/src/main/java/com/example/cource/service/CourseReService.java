package com.example.cource.service;

import com.example.cource.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CourseReService {
    Course findById(Long id);
    void save(Course course);
    void update(Course course);
   Map<Long,Course> getAll();
    void delete(Long id);
}
