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



}
