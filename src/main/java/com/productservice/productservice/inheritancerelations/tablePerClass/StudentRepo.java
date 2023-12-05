package com.productservice.productservice.inheritancerelations.tablePerClass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
    @Override
    Student save(Student student);
}
