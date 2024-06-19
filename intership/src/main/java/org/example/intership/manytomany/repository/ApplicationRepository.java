package org.example.intership.manytomany.repository;

import org.example.intership.manytomany.entity.Application;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
@Query("select a from Application a join fetch a.lecture join fetch a.student")
    Iterable<Application> findAllFetchJoin();
}
