package com.example.schoolproject.repo;

import com.example.schoolproject.repo.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepo extends JpaRepository<SchoolEntity,Long> {
    SchoolEntity findByName(String name);
}
