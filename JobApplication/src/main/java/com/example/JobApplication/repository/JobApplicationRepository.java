package com.example.JobApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.JobApplication.model.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {  
}
