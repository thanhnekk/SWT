package com.learning.codelearn.service.impl;

import com.learning.codelearn.models.Course;
import com.learning.codelearn.models.User;
import com.learning.codelearn.repository.CourseRepository;
import com.learning.codelearn.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @Override
    public List<Course> findAllCourses() {
       return courseRepository.findAll();
    }

    @Override
    public void saveCourse(Course course, User user) {
        course.setUser(user);
        courseRepository.save(course);
    }

    @Override
    public Optional<Course> findById(long courseId) {
        return courseRepository.findById(courseId);
    }

    @Override
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void delete(long courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public List<Course> findByQuery(String query) {
        return courseRepository.findByQuery(query);
    }

    @Override
    public List<Course> findAllByUserId(long userId) {
        List<Course> courses = courseRepository.findAllByUserId(userId);
        return courses;
    }
}
