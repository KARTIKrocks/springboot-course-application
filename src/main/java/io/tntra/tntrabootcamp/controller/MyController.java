package io.tntra.tntrabootcamp.controller;

import io.tntra.tntrabootcamp.Services.CourseService;
import io.tntra.tntrabootcamp.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }


    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addcourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping(("/courses/{courseId}"))
    public Course updateCourse(@PathVariable String courseId, @RequestBody Course course){
        return courseService.updateCourse(Long.parseLong(courseId) ,course );
    }
// hi
    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId){
        this.courseService.deleteCourse(Long.parseLong(courseId));
        return "Course removed !! " + courseId;
    }
}
