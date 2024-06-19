package org.example.intership.manytomany.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationResponse {
    private String name;
    private int age;
    private String teacherName;
    private String title;
}
