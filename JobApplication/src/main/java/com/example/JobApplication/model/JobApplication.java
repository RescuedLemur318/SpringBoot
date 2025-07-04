package com.example.JobApplication.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.GeneratedValue;

@Entity
public class JobApplication {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String fullname;
    private LocalDate dob;
    private String phone;
    private String email;
    private String portfolio;
    private String location;
    private String education;
    private String experience;
    private String years;
    private List<String> skills;
    private String otherSkills;
    private String projects;
    private String reference;
    private String reason;
    private boolean declaration;
   
    @ElementCollection

   public String getFullname() {
    return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getOtherSkills() {
        return otherSkills;
    }

    public void setOtherSkills(String otherSkills) {
        this.otherSkills = otherSkills;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isDeclaration() {
        return declaration;
    }

    public void setDeclaration(boolean declaration) {
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        return "JobApplication{" +
               "fullname='" + fullname + '\'' +
               ", dob=" + dob +
               ", phone='" + phone + '\'' +
               ", email='" + email + '\'' +
               ", portfolio='" + portfolio + '\'' +
               ", location='" + location + '\'' +
               ", education='" + education + '\'' +
               ", experience='" + experience + '\'' +
               ", years='" + years + '\'' +
               ", skills=" + skills +
               ", otherSkills='" + otherSkills + '\'' +
               ", projects='" + projects + '\'' +
               ", reference='" + reference + '\'' +
               ", reason='" + reason + '\'' +
               ", declaration=" + declaration +
               '}';
    }
}