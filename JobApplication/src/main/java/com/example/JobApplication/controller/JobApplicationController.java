package com.example.JobApplication.controller;

import com.example.JobApplication.model.JobApplication;
import com.example.JobApplication.repository.JobApplicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobApplicationController {

@Autowired
private JobApplicationRepository repository;

@GetMapping("/")
public String showForm() {
return "index";
}

@PostMapping("/submit-application")
public ResponseEntity<String> submitApplication(
            @RequestParam("fullname") String fullname,
            @RequestParam("dob") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dob,
            @RequestParam("phone") String phone,
            @RequestParam("email") String email,
            @RequestParam(value = "portfolio", required = false) String portfolio, 
            @RequestParam("location") String location,
            @RequestParam("education") String education,
            @RequestParam("experience") String experience,
            @RequestParam(value = "years", required = false) String years, 
            @RequestParam(value = "skills", required = false) List<String> skills, 
            @RequestParam(value = "other_skills", required = false) String otherSkills,
            @RequestParam(value = "projects", required = false) String projects,
            @RequestParam(value = "reference", required = false) String reference,
            @RequestParam("reason") String reason,
            @RequestParam(value = "declaration", required = false) boolean declaration 
    ) {
        JobApplication application = new JobApplication();
        application.setFullname(fullname);
        application.setDob(dob);
        application.setPhone(phone);
        application.setEmail(email);
        application.setPortfolio(portfolio);
        application.setLocation(location);
        application.setEducation(education);
        application.setExperience(experience);
        application.setYears(years);
        application.setSkills(skills);
        application.setOtherSkills(otherSkills);
        application.setProjects(projects);
        application.setReference(reference);
        application.setReason(reason);
        application.setDeclaration(declaration);

      repository.save(application);
      //System.out.println("Received Job Application:");
      //System.out.println(application.toString());
        return ResponseEntity.ok("Application Submitted Successfully!");
    }
}