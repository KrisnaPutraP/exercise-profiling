package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findFirstByOrderByGpaDesc();    // Equivalent to: SELECT * FROM students ORDER BY gpa DESC LIMIT 1;
}