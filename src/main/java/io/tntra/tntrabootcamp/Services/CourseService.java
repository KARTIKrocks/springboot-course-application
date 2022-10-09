package io.tntra.tntrabootcamp.Services;

import io.tntra.tntrabootcamp.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(long courseId, Course course);
    public Course deleteCourse(long courseId);
}
