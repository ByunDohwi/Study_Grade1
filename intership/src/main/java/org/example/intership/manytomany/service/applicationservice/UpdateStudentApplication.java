package org.example.intership.manytomany.service.applicationservice;

import jakarta.transaction.Transactional;
import org.example.intership.manytomany.dto.ApplicationDto;
import org.example.intership.manytomany.dto.StudentDto;
import org.example.intership.manytomany.entity.Application;
import org.example.intership.manytomany.entity.Student;
import org.example.intership.manytomany.repository.ApplicationRepository;
import org.example.intership.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateStudentApplication {
    @Autowired
    ApplicationRepository applicationRepository;
    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public void updateApplication(Long id, Long stuid) {
        Application application = applicationRepository.findById(id).orElseThrow();
        Student student = studentRepository.findById(stuid).orElseThrow();
        application.update(student);
    }
}
