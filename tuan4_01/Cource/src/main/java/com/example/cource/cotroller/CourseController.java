package com.example.cource.cotroller;

import com.example.cource.model.Course;
import com.example.cource.model.User;
import com.example.cource.service.CourseService;
import com.example.cource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService service;
    @Autowired
    private UserService Uservice;
    @PostMapping("/")
    public Course addCourse(@RequestBody Course course){
        Course c = service.save(course);
        return c;
    }
    @GetMapping("/")
    public List<Course> findAll(){
        List<Course> l = service.findAll();
        return l;
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    @PostMapping("/update/{id}")
    public Course update(@RequestBody Course course, @PathVariable Long id){
        Course c = service.findByID(id);
        if(c==null)
            return null;
        c.setName(course.getName());
        c.setPrice(course.getPrice());
        c.setDescription(course.getDescription());
        c.setOldPrice(course.getOldPrice());
        c.setCreatedBy(course.getCreatedBy());
        service.save(c);
        return c;
    }
}
