package org.example.intership.manytomany.controller;

import org.example.intership.manytomany.dto.ApplicationDto;
import org.example.intership.manytomany.dto.ApplicationResponse;
import org.example.intership.manytomany.dto.LectureDto;
import org.example.intership.manytomany.dto.StudentDto;
import org.example.intership.manytomany.service.applicationservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {
    @Autowired
    DeleteApplication deleteApplicationl;
    @Autowired
    GetApplication getApplication;
    @Autowired
    PostApplication postApplication;
    @Autowired
    UpdateLectureApplication updateLectureApplication;
    @Autowired
    UpdateStudentApplication updateStudentApplication;

    @GetMapping("/getApp/{id}")
    public ApplicationResponse getApp(@PathVariable Long id) {
        return getApplication.getApplication(id);
    }

    @PostMapping("/postApp/{stuid}/{lecid}")
    public void postApp(@PathVariable(value = "lecid") Long lecid, @PathVariable(value = "stuid") Long stuid) {
        postApplication.postApplication(lecid, stuid);
    }

    @DeleteMapping("/deleteApp/{id}")
    public void delApp(@PathVariable Long id) {
        deleteApplicationl.deleteApplication(id);
    }

    @PatchMapping("/updateStuApp/{id}/{stuid}")
    public void updateStuApp(@PathVariable(value = "id") Long id,@PathVariable(value = "stuid")Long stuid) {
        updateStudentApplication.updateApplication(id,stuid);
    }

    @PatchMapping("/updateLecApp/{id}/{lecid}")
    public void updateLecApp(@PathVariable(value = "id") Long id, @PathVariable(value = "lecid")Long stuid ) {
    updateLectureApplication.updateApplication(id,stuid);
    }
}
