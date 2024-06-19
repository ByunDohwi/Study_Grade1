package org.example.intership.manytoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Company {
    public Company() {
    }

    public Company( String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Department> departmentList;


}
