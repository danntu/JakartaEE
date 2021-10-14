package kz.iitu.jakartaee.cdi.lab6;

import jakarta.enterprise.context.RequestScoped;

import java.util.List;

@RequestScoped
public class StudentRepositoryImp implements StudentRepository{
    @Override
    public List<Student> findAll() {
        return Student.getStudents();
    }


    @Override
    public Student findByLastName(String lastName) {
        return (Student) Student.getStudents().stream().filter(n -> n.getLastName().equals(lastName));
    }
}
