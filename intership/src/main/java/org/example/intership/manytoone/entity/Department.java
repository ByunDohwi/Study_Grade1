package org.example.intership.manytoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Department(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    @ManyToOne
    @JoinColumn(name = "comqany_id", nullable = false)//null이 들어갈 수 없음
    private Company company;

    public Department() {
    }

}
