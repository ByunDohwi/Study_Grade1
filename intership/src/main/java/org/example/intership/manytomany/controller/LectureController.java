package org.example.intership.manytomany.controller;

import org.example.intership.manytomany.dto.LectureDto;
import org.example.intership.manytomany.service.lectureservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LectureController {
    @Autowired
    DeleteLecture deleteLecture;
    @Autowired
    GetLecture getLecture;
    @Autowired
    SaveLecture saveLecture;
    @Autowired
    UpdateLecture updateLecture;
    @Autowired
    LecList lecList;
    @Autowired
    LecNameList lecNameList;

    @GetMapping("/getLecture/{id}")
    public LectureDto getLecture(@PathVariable long id) {
        return getLecture.getlecture(id);
    }

    @PostMapping("/postLecture")
    public void deleteLecture(@RequestBody LectureDto lectureDto) {
        saveLecture.saveLecture(lectureDto);
    }

    @PatchMapping("/updateLecture/{id}")
    public void updateLecture(@PathVariable Long id, @RequestBody LectureDto lectureDto) {
        updateLecture.updateLecture(id, lectureDto);
    }

    @DeleteMapping("/deleteLecture/{id}")
    public void deleteLecture(@PathVariable Long id) {
        deleteLecture.deleteLecture(id);
    }

    @GetMapping("lecList/{stuId}")
    public List<LectureDto> LecList(@PathVariable Long stuId) {
        return lecList.lecList(stuId);
    }

    @GetMapping("/lecListName/{stuId}")
    public List<String> lecNameSay(@PathVariable Long stuId) {
        return lecNameList.saylecName(stuId);
    }
}
