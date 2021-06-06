package com.qyq.controller;

import com.qyq.pojo.Course;
import com.qyq.pojo.Result;
import com.qyq.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CourseController {
@Autowired
private CourseService courseService;

    @RequestMapping("findByNameCourse")
    public Result findByNameCourse( String name) {
        name="c";
        Course byNameCourse = courseService.findByNameCourse(name);


        return new Result(true,200,"OK",byNameCourse);
    }


@RequestMapping("addCourse")
    public Result addCourse( Course course) {
    course.setName("C++");
        courseService.save(course);

        return new Result(true,200,"OK");
    }

    @RequestMapping("updateCourse")
    public String updateCourse(Integer id,Course course) {
       id =22;
        Course course1 = courseService.findByid(id);
        course1.setName("c");
        courseService.save(course1);
        return "ok";
    }

    @RequestMapping("deleteCourse")
    public String updateCourse(Course course) {
        course.setId(22);
        Course course1 = courseService.findByid(course.getId());
        courseService.delete(course1);

        return "ok";
    }
}
