package com.API.App.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
