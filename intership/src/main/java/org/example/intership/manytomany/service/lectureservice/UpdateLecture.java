package org.example.intership.manytomany.service.lectureservice;

import jakarta.transaction.Transactional;
import org.example.intership.manytomany.dto.LectureDto;
import org.example.intership.manytomany.entity.Lecture;
import org.example.intership.manytomany.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateLecture {
    @Autowired
    LectureRepository lectureRepository;

    @Transactional
    public void updateLecture(Long id, LectureDto lectureDto) {
        Lecture lecture = lectureRepository.findById(id).orElseThrow();
        if (lectureDto.getTeacherName() != null) {
            lecture.setTeacherName(lectureDto.getTeacherName());
        }
        if (lectureDto.getTitle() != null) {
            lecture.setTitle(lectureDto.getTitle());
        }
    }
}
