package org.example.intership.manytomany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Lecture lecture;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    public Application(Lecture lecture, Student student) {
        this.lecture = lecture;
        this.student = student;
    }

    public void update(Lecture lecture){
        this.lecture = lecture;
    }

    public void update(Student student) {
        this.student = student;
    }
}
