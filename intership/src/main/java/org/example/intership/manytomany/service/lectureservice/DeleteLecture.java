package org.example.intership.manytomany.service.lectureservice;

import org.example.intership.manytomany.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteLecture {
    @Autowired
    LectureRepository lectureRepository;

    public void deleteLecture(Long id) {
        lectureRepository.deleteById(id);
    }

}
