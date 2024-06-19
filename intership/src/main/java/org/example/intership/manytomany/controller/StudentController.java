package org.example.intership.manytomany.controller;

import org.example.intership.manytomany.dto.StudentDto;
import org.example.intership.manytomany.service.studentservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
    DeleteStudent deleteStudent;
    @Autowired
    GetStudent getStudent;
    @Autowired
    PostStudent postStudent;
    @Autowired
    UpdateStudent updateStudent;
    @Autowired
    StuList stuList;

    @GetMapping("/getStudent/{id}")
    public StudentDto getStudent(@PathVariable Long id) {
        return getStudent.getStudent(id);
    }

    @PostMapping("/postStudent")
    public void postStudent(@RequestBody StudentDto studentDto) {
        postStudent.postStudent(studentDto);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Long id) {
        deleteStudent.deleteStudent(id);
    }

    @PatchMapping("/updateStudent/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody StudentDto studentDto) {
        updateStudent.updateStudent(id, studentDto);
    }

    @GetMapping("/StuList/{stuId}")
    public List<StudentDto> StuList(@PathVariable Long stuId) {
        return stuList.stuList(stuId);
    }
}
