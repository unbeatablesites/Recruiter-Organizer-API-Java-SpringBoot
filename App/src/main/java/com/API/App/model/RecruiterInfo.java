package com.API.App.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RecruiterInfo {
}
