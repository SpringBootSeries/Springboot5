package com.backend.Backend.Controller;
import com.backend.Backend.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/course")

public class CourseController extends CRUDController<String, Course> {
    {
        Course ecommerce = new Course("IT3232", "Practical for E-commerce", 2);
        Course webservice = new Course("IT2234", "WebService and server Technology", 4);
        Course webapplication = new Course("CSC3132", "Web Application Development", 2);

        getMap().put(webapplication.getCode(), webapplication);
        getMap().put(webservice.getCode(), webservice);
        getMap().put(ecommerce.getCode(), ecommerce);

    }


    }
