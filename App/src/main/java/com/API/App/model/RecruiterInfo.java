package com.API.App.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "recruiter")
public class RecruiterInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer recruiterId;
    private String recruiterFirstName;
    private String recruiterLastName;
    private String companyName;
    private String recruiterPhoneNumber;
    private LocalDate dateLastSpokeTo;
    private Boolean interested;
    private String notes;

    public Integer getRecruiterId() {
        return recruiterId;
    }

    public void setRecruiterId(Integer recruiterId) {
        this.recruiterId = recruiterId;
    }

    public String getRecruiterFirstName() {
        return recruiterFirstName;
    }

    public void setRecruiterFirstName(String recruiterFirstName) {
        this.recruiterFirstName = recruiterFirstName;
    }

    public String getRecruiterLastName() {
        return recruiterLastName;
    }

    public void setRecruiterLastName(String recruiterLastName) {
        this.recruiterLastName = recruiterLastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRecruiterPhoneNumber() {
        return recruiterPhoneNumber;
    }

    public void setRecruiterPhoneNumber(String recruiterPhoneNumber) {
        this.recruiterPhoneNumber = recruiterPhoneNumber;
    }

    public LocalDate getDateLastSpokeTo() {
        return dateLastSpokeTo;
    }

    public void setDateLastSpokeTo(LocalDate dateLastSpokeTo) {
        this.dateLastSpokeTo = dateLastSpokeTo;
    }

    public Boolean getInterested() {
        return interested;
    }

    public void setInterested(Boolean interested) {
        this.interested = interested;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
