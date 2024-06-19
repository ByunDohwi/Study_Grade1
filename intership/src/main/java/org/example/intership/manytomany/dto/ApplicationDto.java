package org.example.intership.manytomany.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.intership.manytomany.entity.Lecture;
import org.example.intership.manytomany.entity.Student;
import org.example.intership.manytomany.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationDto {


    private Student student;
    private Lecture lecture;

    public ApplicationDto(Long lectureId, Long StudentId){

    }
}
