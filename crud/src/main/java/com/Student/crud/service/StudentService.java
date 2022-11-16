package com.Student.crud.service;

import com.Student.crud.Repository.StudentRepository;
import com.Student.crud.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public Students save(Students st)
    {
        return studentRepository.save(st);
    }
    public  Students getStudents(int id)
    {
        return  studentRepository.findById(id).get();
    }
    public  Students update(Students sto)
    {
        Students st=studentRepository.findById(sto.getId()).get();
        st.setName(sto.getName());
        st.setGender(sto.getGender());

        return  studentRepository.save(sto);
    }
    public  Students delete(int id)
    {
        studentRepository.deleteById(id);
        Students st=new Students();
        return st;
    }
    public  StudentRepository getStudentRepository(){
        return studentRepository;
    }
}
