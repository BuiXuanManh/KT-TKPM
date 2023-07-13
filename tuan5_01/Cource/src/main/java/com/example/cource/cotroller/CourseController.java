package com.example.cource.cotroller;

import com.example.cource.model.Course;
import com.example.cource.service.CourseReService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

    private CourseReService courseReService;

    public CourseController(CourseReService courseReService) {
        this.courseReService = courseReService;
    }
    //    @Autowired
//    private UserReService Uservice;

    @PostMapping("/")
    public void addCourse(@RequestBody Course course) {
        courseReService.save(course);

    }

    @GetMapping("/")
    public Map<Long,Course> findAll() {
        Map<Long,Course>  l =  courseReService.getAll();
        return l;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        courseReService.delete(id);
    }

    @PostMapping("/update/{id}")
    public Course update(@RequestBody Course course, @PathVariable Long id) {
        Course c = courseReService.findById(id);
        if (c == null)
            return null;
        c.setName(course.getName());
        c.setPrice(course.getPrice());
        c.setDescription(course.getDescription());
        c.setOldPrice(course.getOldPrice());
        c.setCreatedBy(course.getCreatedBy());
        courseReService.save(c);
        return c;
    }


}
