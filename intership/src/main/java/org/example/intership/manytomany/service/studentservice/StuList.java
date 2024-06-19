package org.example.intership.manytomany.service.studentservice;

import org.example.intership.manytomany.dto.ApplicationDto;
import org.example.intership.manytomany.dto.StudentDto;
import org.example.intership.manytomany.entity.Application;
import org.example.intership.manytomany.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class StuList {
    @Autowired
    ApplicationRepository applicationRepository;

    @Transactional(readOnly = true)
    public List<StudentDto> stuList(Long lecId) {
        Iterable<Application> applicationIterable = applicationRepository.findAll();
        List<Application> applicationList = (List<Application>) applicationIterable;
        List<StudentDto> studentDtoList = new ArrayList<>();
        for (Application application : applicationList) {
            if (lecId.equals(application.getLecture().getId())) {
                StudentDto studentDto = new StudentDto(application.getStudent().getName(), application.getStudent().getAge());
                studentDtoList.add(studentDto);
            }
        }
        return studentDtoList;
    }
}
