package org.example.intership.manytomany.service.lectureservice;

import org.example.intership.manytomany.dto.LectureDto;
import org.example.intership.manytomany.entity.Lecture;
import org.example.intership.manytomany.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetLecture {
    @Autowired
    LectureRepository lectureRepository;

    public LectureDto getlecture(Long id) {
        Lecture lecture = lectureRepository.findById(id).orElseThrow();
         LectureDto lectureDto  = new LectureDto(
                lecture.getTitle(),
                lecture.getTeacherName()
        );
         return lectureDto;
    }
}
