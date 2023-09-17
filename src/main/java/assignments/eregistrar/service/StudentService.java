package assignments.eregistrar.service;


import assignments.eregistrar.entity.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    void update(Student student);
    void deleteById(Long id);
    Student findById(Long id);
    List<Student> search(String searchString);
    Page<Student> findAllStudentsPaged(int pageNo);
    List<Student> findAll();
}
