package com.backend.Backend.Controller;
import com.backend.Backend.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class AppController  extends CRUDController<String, Student>{
    public AppController()
    {
        Student s1 = new Student("2020ICT65","Suman",23,"IT",3.66);
        Student s2 = new Student("2020NO54","Ruwin",24,"Social Harmony",3.80);
        Student s3 = new Student("2020BS56","Nimna",23,"BIO Sceince",4.0);
        Student s4 = new Student("2020PM76","Serim",25,"Project Management",3.59);
        Student s5 = new Student("2020ICT34","Kaushik",30,"Information and Computer technology",3.25);


        getMap().put(s1.getRegNo(),s1);
        getMap().put(s2.getRegNo(),s2);
        getMap().put(s3.getRegNo(),s3);
        getMap().put(s4.getRegNo(),s4);
        getMap().put(s5.getRegNo(),s5);

    }
}
