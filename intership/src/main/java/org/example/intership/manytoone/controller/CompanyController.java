package org.example.intership.manytoone.controller;

import org.example.intership.manytoone.dto.CompanyDto;
import org.example.intership.manytoone.dto.DepartmentDto;
import org.example.intership.manytoone.entity.Department;
import org.example.intership.manytoone.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("/makeCompany")
    public void makeCompany(@RequestBody CompanyDto companyDto) {
        companyService.saveCompany(companyDto);
    }

    @GetMapping("/getCompany/{id}")
    public CompanyDto getCompany(@PathVariable Long id) {
       return companyService.getCompany(id);
    }

    @DeleteMapping("/deleteCompany/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }

    @PatchMapping("/updateCompany")
    public void updateCompany(@RequestParam Long id, @RequestBody CompanyDto companyDto) {
        companyService.updateCompany(id, companyDto);
    }

    @GetMapping("findAll/{id}")
    public List<DepartmentDto> findAllDapartment(@PathVariable Long id) {
        return companyService.findAll(id);
    }
}
