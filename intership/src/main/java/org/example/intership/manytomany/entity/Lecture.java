package org.example.intership.manytomany.entity;

import jakarta.persistence.*;
import jakarta.servlet.ServletRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String teacherName;
    @OneToMany(mappedBy = "lecture", cascade = CascadeType.ALL)
    private List<Application> applicationList;

    public void titleUpdate(String title) {
        this.title = title;
    }

    public void teacherNameUpdate(String teacherName) {
        this.teacherName = teacherName;
    }
    public Lecture(String title, String teacherName) {
        this.title = title;
        this.teacherName = teacherName;
    }

    public Lecture(Long id, String title, String teacherName) {
        this.id = id;
        this.title = title;
        this.teacherName = teacherName;
    }
}
