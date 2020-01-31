package com.API.App.dao;

import com.API.App.model.RecruiterInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RecruiterRepositoryTest {


    @Autowired
    RecruiterRepository recruiterRepository;

    @Test
    void findByrecruiterFirstName() {

        recruiterRepository.deleteAll();

        RecruiterInfo newRecruiter = new RecruiterInfo();

            newRecruiter.setRecruiterFirstName("Frank");

    }

    @Test
    void findByrecruiterPhoneNumber() {
    }

    @Test
    void findBycompanyName() {
    }
}