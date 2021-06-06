package com.qyq.dao;

import com.qyq.pojo.Course;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface CourseDao extends JpaRepositoryImplementation<Course,Integer> {
    Course findByid(Integer id);

    Course findByname(String name);
}
