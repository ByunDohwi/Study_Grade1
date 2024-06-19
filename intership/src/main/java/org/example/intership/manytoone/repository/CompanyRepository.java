package org.example.intership.manytoone.repository;

import org.example.intership.manytoone.entity.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
