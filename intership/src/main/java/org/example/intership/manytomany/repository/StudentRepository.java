package org.example.intership.manytomany.repository;

import org.example.intership.manytomany.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
