package org.example.intership.manytomany.service.lectureservice;

import org.example.intership.manytomany.entity.Application;
import org.example.intership.manytomany.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class LecNameList {
    @Autowired
    ApplicationRepository applicationRepository;
    public List<String> saylecName(Long stuId) {
        Iterable applicationIterable = applicationRepository.findAllFetchJoin();
        List<Application> appList = (List<Application>)applicationIterable;

        List<String> nameList = appList.stream()
                .filter(ai -> ai.getStudent().getId().equals(stuId))
                .map(ai -> ai.getLecture().getTitle())
                .collect(Collectors.toList());
        return nameList;
    }

}
