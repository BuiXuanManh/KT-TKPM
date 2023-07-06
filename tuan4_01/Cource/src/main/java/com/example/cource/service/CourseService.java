package com.example.cource.service;

import com.example.cource.model.Course;

import java.util.List;

public interface CourseService {
    Course save(Course course);
    Course findByID(Long id);
    List<Course> findAll();
    void delete(Long id);
}
