package com.qyq.service;

import com.qyq.dao.CourseDao;
import com.qyq.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CourseService {
    @Autowired
    private CourseDao courseDao;


    public void save(Course course) {
        course.setCreate_date(new Date());
        course.setIs_show(0);
        course.setUser_id(1);
        course.setOrder_no(1);
        courseDao.save(course);
    }
    @Cacheable
    public Course findByid(Integer id) {
       return courseDao.findByid(id);
    }

    public Course findByNameCourse(String name) {
      return  courseDao.findByname(name);
    }

    public void delete(Course course1) {
        courseDao.delete(course1);
    }
}
