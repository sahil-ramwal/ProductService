package com.productservice.productservice.inheritancerelations.mappedsuperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.file.LinkOption;
@Repository("ms_mentorRepo")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
    @Override
    Mentor  save( Mentor mentor);
}
