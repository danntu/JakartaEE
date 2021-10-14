package kz.iitu.jakartaee.cdi.lab6;


import jakarta.inject.Inject;

import java.util.List;


public class StudentService {

    @Inject
    StudentRepository studentRepository;

    public List<Student> getAllStu(){
        return studentRepository.findAll();
    }
}
