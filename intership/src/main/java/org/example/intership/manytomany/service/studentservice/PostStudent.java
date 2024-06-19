package org.example.intership.manytomany.service.studentservice;

import jakarta.servlet.ServletRequest;
import org.example.intership.manytomany.dto.StudentDto;
import org.example.intership.manytomany.entity.Student;
import org.example.intership.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostStudent {
    @Autowired
    StudentRepository studentRepository;

    public void postStudent(StudentDto studentDto) {
        Student student = new Student(
                studentDto.getName(),
                studentDto.getAge()
        );
        studentRepository.save(student);
    }
}
