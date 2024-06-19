package org.example.intership.manytomany.service.applicationservice;

import org.example.intership.manytomany.dto.ApplicationDto;
import org.example.intership.manytomany.dto.ApplicationResponse;
import org.example.intership.manytomany.entity.Application;
import org.example.intership.manytomany.entity.Lecture;
import org.example.intership.manytomany.repository.ApplicationRepository;
import org.example.intership.manytomany.repository.LectureRepository;
import org.example.intership.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetApplication {
    @Autowired
    ApplicationRepository applicationRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    LectureRepository lectureRepository;
    public ApplicationResponse getApplication(Long id) {
        Application application = applicationRepository.findById(id).orElseThrow();
        ApplicationResponse applicationResponse = new ApplicationResponse(application.getStudent().getName(),application.getStudent().getAge(),application.getLecture().getTeacherName(),application.getLecture().getTitle());
        return applicationResponse;
    }

}
