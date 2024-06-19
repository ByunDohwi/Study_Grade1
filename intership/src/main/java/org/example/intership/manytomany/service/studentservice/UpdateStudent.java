package org.example.intership.manytomany.service.studentservice;

import jakarta.transaction.Transactional;
import org.example.intership.manytomany.dto.StudentDto;
import org.example.intership.manytomany.entity.Student;
import org.example.intership.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Service;

@Service
public class UpdateStudent {
    @Autowired
    StudentRepository repository;

    @Transactional
    public void updateStudent(Long id, StudentDto studentDto) {
        Student student = repository.findById(id).orElseThrow();
        if (studentDto.getName() != null) {
            student.update(studentDto.getName());
        }
        if (studentDto.getAge() != 0) {
            student.update(studentDto.getAge());
        }

    }
}
