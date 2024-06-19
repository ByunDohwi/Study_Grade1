package org.example.intership.manytoone.service;

import jakarta.transaction.Transactional;
import org.example.intership.manytoone.dto.DepartmentDto;
import org.example.intership.manytoone.entity.Department;
import org.example.intership.manytoone.repository.CompanyRepository;
import org.example.intership.manytoone.repository.DepatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepatmentRepository depatmentRepository;

    @Autowired
    CompanyRepository companyRepository;

    public void saveDepartent(Long companyId, DepartmentDto departmentDto) {
        Department department = new Department(
                departmentDto.getName(),
                companyRepository.findById(companyId).orElseThrow()
        );
        depatmentRepository.save(department);
    }

    public DepartmentDto getDepartment(Long id) {
        Department department = depatmentRepository.findById(id).orElseThrow();
        DepartmentDto dto = new DepartmentDto(department.getName());
        return dto;
    }

    public void deleteDepartment(Long id) {
        depatmentRepository.deleteById(id);
    }
    @Transactional
    public void updateDatertment(Long id, DepartmentDto dto) {
        Department department = depatmentRepository.findById(id).orElseThrow();
        department.setName(dto.getName());
    }

}
