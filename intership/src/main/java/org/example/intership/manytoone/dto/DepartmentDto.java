package org.example.intership.manytoone.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.intership.manytoone.entity.Department;

@Getter
@NoArgsConstructor
public class DepartmentDto {
    String name;

    public DepartmentDto(String name) {
        this.name = name;
    }

    public DepartmentDto(Department department) {
        this.name = department.getName();
    }
}
