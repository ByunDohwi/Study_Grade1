package org.example.intership.manytomany.service.lectureservice;

import org.example.intership.manytomany.dto.LectureDto;
import org.example.intership.manytomany.entity.Lecture;
import org.example.intership.manytomany.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveLecture {
    @Autowired
    LectureRepository lectureRepository;
    public void saveLecture(LectureDto dto) {
        Lecture lecture = new Lecture(
                dto.getTeacherName(),
                dto.getTitle()
        );
        lectureRepository.save(lecture);
    }
}
