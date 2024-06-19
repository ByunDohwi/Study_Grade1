package org.example.intership.manytomany.service.applicationservice;

import jakarta.transaction.Transactional;
import org.example.intership.manytomany.dto.LectureDto;
import org.example.intership.manytomany.entity.Application;
import org.example.intership.manytomany.entity.Lecture;
import org.example.intership.manytomany.repository.ApplicationRepository;
import org.example.intership.manytomany.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateLectureApplication {
    @Autowired
    ApplicationRepository applicationRepository;
    @Autowired
    LectureRepository lectureRepository;

    @Transactional
    public void updateApplication(Long id, Long lecid) {
        Application application = applicationRepository.findById(id).orElseThrow();
        Lecture lecture = lectureRepository.findById(lecid).orElseThrow();
        application.update(lecture);
    }
}
