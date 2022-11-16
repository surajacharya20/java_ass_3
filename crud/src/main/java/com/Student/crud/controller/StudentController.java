package com.Student.crud.controller;

import com.Student.crud.entity.Students;
import com.Student.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Students")
public class StudentController {

    @Autowired
    private StudentService studentservice;
    @GetMapping(path = "/{id}")
    public Students getStudents(@PathVariable int id)
    {
        return  studentservice.getStudents(id);

    }
    @PostMapping("/{id}")
    public  Students addStudents(@RequestBody Students st)
    {
        return studentservice.save(st);
    }

    @PutMapping
    public Students updateStudents(@RequestBody Students st){
        return studentservice.update(st);
    }
    @DeleteMapping
    public Students deleteStudents(@RequestBody Students st){
        return studentservice.delete(st.getId());
    }


}
