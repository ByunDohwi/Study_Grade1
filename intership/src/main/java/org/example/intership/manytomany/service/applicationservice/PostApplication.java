package org.example.intership.manytomany.service.applicationservice;

import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import org.example.intership.manytomany.dto.ApplicationDto;
import org.example.intership.manytomany.entity.Application;
import org.example.intership.manytomany.repository.ApplicationRepository;
import org.example.intership.manytomany.repository.LectureRepository;
import org.example.intership.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostApplication {
    @Autowired
    ApplicationRepository applicationRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    LectureRepository lectureRepository;

    public void postApplication(Long lectureId, Long StudentId) {
        Application application = new Application(lectureRepository.findById(lectureId).orElseThrow(),studentRepository.findById(StudentId).orElseThrow());
        applicationRepository.save(application);
    }
}
