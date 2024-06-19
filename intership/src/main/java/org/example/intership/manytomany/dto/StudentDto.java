package org.example.intership.manytomany.dto;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.intership.manytomany.entity.Application;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private String name;
    private int age;

    public StudentDto(String name) {
        this.name = name;
        this.age = 0;
    }
}
