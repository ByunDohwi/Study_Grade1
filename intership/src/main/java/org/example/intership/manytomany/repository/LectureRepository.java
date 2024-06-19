package org.example.intership.manytomany.repository;

import org.example.intership.manytomany.entity.Lecture;
import org.springframework.data.repository.CrudRepository;

public interface LectureRepository extends CrudRepository<Lecture, Long> {
}
