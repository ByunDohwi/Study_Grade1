package org.example.intership.manytomany.service.studentservice;

import org.example.intership.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteStudent {
    @Autowired
    StudentRepository studentRepository;

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
