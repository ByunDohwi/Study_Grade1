package org.example.intership.manytoone.controller;

import org.example.intership.manytoone.dto.DepartmentDto;
import org.example.intership.manytoone.entity.Department;
import org.example.intership.manytoone.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("makeDepartment/{id}")
    public void saveDepartment(@PathVariable Long id, @RequestBody DepartmentDto departmentDto) {
        departmentService.saveDepartent(id, departmentDto);
    }

    @GetMapping("/name")
    public String sayMyName() {
        return "도휘";
    }


    @GetMapping("getDepartment/{id}")
    public DepartmentDto getDepartment(@PathVariable Long id) {
        return departmentService.getDepartment(id);
    }

    @DeleteMapping("deleteDepartment/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }

    @PatchMapping("updateDepartment/{id}")
    public void updateDepartment(@PathVariable Long id, @RequestBody DepartmentDto departmentDto) {
        departmentService.updateDatertment(id, departmentDto);
    }

}
