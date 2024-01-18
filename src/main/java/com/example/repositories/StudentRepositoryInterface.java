package com.example.repositories;

import com.example.model.Student;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface StudentRepositoryInterface extends CrudRepository<Student,Long> {
    @Override
    void deleteAll();
}
