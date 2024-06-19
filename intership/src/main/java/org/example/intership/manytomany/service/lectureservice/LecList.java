package org.example.intership.manytomany.service.lectureservice;

import lombok.AllArgsConstructor;
import org.example.intership.manytomany.dto.LectureDto;
import org.example.intership.manytomany.entity.Application;
import org.example.intership.manytomany.entity.Lecture;
import org.example.intership.manytomany.repository.ApplicationRepository;
import org.example.intership.manytomany.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class LecList {
    @Autowired
    LectureRepository lectureRepository;
    @Autowired
    ApplicationRepository applicationRepository;

    @Transactional(readOnly = true)
    public List<LectureDto> lecList(Long stuid) {
        Iterable<Application> lectureIterator = applicationRepository.findAll();
        List<Application> applicationList = (List<Application>)lectureIterator;
        List<LectureDto> lectureDtoList = new ArrayList<>();
        for (Application app : applicationList) {
            if (stuid.equals(app.getStudent().getId())) {
                LectureDto lectureDto = new LectureDto(app.getLecture().getTitle(), app.getLecture().getTeacherName());
                lectureDtoList.add(lectureDto);
            }
        }
        return lectureDtoList;
    }
}
