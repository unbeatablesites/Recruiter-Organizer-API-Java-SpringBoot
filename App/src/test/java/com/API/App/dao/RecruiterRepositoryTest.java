package com.API.App.dao;

import com.API.App.model.RecruiterInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

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
        newRecruiter.setRecruiterLastName("Uzoka");
        newRecruiter.setRecruiterPhoneNumber("404-250-2486");
        newRecruiter.setCompanyName("NASA");
        newRecruiter.setDateLastSpokeTo(LocalDate.of(2020,01,31));
        newRecruiter.setInterested(true);
        newRecruiter.setNotes("Very cool sounding job!");

        recruiterRepository.save(newRecruiter);

        List<RecruiterInfo> listOfRec = recruiterRepository.findAll();
        assertEquals(1, listOfRec.size());

        List<RecruiterInfo> listOfRec2 = recruiterRepository.findByrecruiterFirstName("Frank");
        assertEquals(1, listOfRec.contains("Frank"));

        List<RecruiterInfo> listOfRec3 = recruiterRepository.findByrecruiterFirstName("Mike");
        assertEquals(0, listOfRec.size());


    }

    @Test
    void findByrecruiterPhoneNumber() {
    }

    @Test
    void findBycompanyName() {
    }
}