package org.example.intership.manytoone.service;

import jakarta.transaction.Transactional;
import org.example.intership.manytoone.dto.CompanyDto;
import org.example.intership.manytoone.dto.DepartmentDto;
import org.example.intership.manytoone.entity.Company;
import org.example.intership.manytoone.entity.Department;
import org.example.intership.manytoone.repository.CompanyRepository;
import org.example.intership.manytoone.repository.DepatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    DepatmentRepository depatmentRepository;
    public void saveCompany(CompanyDto companyDto) {

        Company company = new Company(companyDto.getName());
        companyRepository.save(company);
    }

    public CompanyDto getCompany(Long id) {
        Company company =  companyRepository.findById(id).orElseThrow();
        CompanyDto dto = new CompanyDto(company.getName());
        return dto;
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    @Transactional
    public void updateCompany(Long id,CompanyDto companyDto) {
        Company company = companyRepository.findById(id).orElseThrow();
        company.setName(companyDto.getName());
    }

    public List<DepartmentDto> findAll(Long id) {
       Iterable<Department> departments = depatmentRepository.findAll();
        List<Department> departmentList = (List<Department>)departments;
        List<DepartmentDto> departmentDtos = new ArrayList<>();
        for (Department department : departmentList) {
            DepartmentDto dto = new DepartmentDto(department.getName());
            if(id.equals(department.getCompany().getId())){
                departmentDtos.add(dto);
            }
        }
       return departmentDtos;
    }
}
