package com.example.cource.service.implement;

import com.example.cource.model.Course;
import com.example.cource.service.CourseReService;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CourseReImpl implements CourseReService {

    private RedisTemplate<Long,Course> redisTemplate;
    private HashOperations operations;

    public CourseReImpl(RedisTemplate<Long, Course> template) {
        this.redisTemplate = template;
        operations = template.opsForHash();
    }

    @Override
    public Course findById(Long id) {
        return (Course) operations.get("COURSE",id);
    }

    @Override
    public void save(Course course) {
        operations.put("COURSE",course.getId(),course);
    }

    @Override
    public void update(Course course) {
        operations.put("COURSE",course.getId(),course);
    }

    @Override
    public Map<Long,Course> getAll() {
        return operations.entries("COURSE");
    }

    @Override
    public void delete(Long id) {
        operations.delete("COURSE",id);
    }
}
