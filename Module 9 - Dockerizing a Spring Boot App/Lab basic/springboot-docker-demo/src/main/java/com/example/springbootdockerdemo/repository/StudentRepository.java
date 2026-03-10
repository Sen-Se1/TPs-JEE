package com.example.springbootdockerdemo.repository;

import com.example.springbootdockerdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
