package io.tntra.tntrabootcamp.Services;

import io.tntra.tntrabootcamp.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{


    List<Course> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(145,"Java Core", "This is SpringBoot"));
        list.add(new Course(4343,"Java Core2", "This is SpringBoot2"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course:list){
            if(course.getId()==courseId){
                c = course;
                break;
            }
        }
        return c;
    }

    public Course addCourse(Course course){
        list.add(course);
        return course;
    }

    public Course updateCourse(long courseId,Course course){
//        Course c = null;
        for(Course co:list){
            if(co.getId()==courseId){
                co= course;
                return co;
            }
        }
        
        return course;
    }

    public Course deleteCourse(long courseId){
        list.removeIf(x -> x.getId() == (courseId));
        return null;

    }
}
