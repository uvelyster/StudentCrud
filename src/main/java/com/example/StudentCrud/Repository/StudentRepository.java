package com.example.StudentCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentCrud.Domain.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}