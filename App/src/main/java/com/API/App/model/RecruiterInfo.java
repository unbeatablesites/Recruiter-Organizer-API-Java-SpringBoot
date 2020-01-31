package com.API.App.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RecruiterInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer recruiterId;
    private String recruiterName;
    private String companyName;


}
