package kz.iitu.jakartaee.cdi.lab6;



import java.util.List;


public interface StudentRepository {
    List<Student> findAll();

    Student findByLastName(String lastName);

}
