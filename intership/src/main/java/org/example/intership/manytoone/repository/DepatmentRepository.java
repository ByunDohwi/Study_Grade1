package org.example.intership.manytoone.repository;

import org.example.intership.manytoone.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DepatmentRepository extends CrudRepository<Department, Long> {
    @Override
    Iterable<Department> findAll();
}
