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

        RecruiterInfo newRecruiter2 = new RecruiterInfo();

        newRecruiter2.setRecruiterFirstName("Carl");
        newRecruiter2.setRecruiterLastName("Baker");
        newRecruiter2.setRecruiterPhoneNumber("770-250-2020");
        newRecruiter2.setCompanyName("IBM");
        newRecruiter2.setDateLastSpokeTo(LocalDate.of(2020,01,30));
        newRecruiter2.setInterested(false);
        newRecruiter2.setNotes("Not so cool sounding job!");

        recruiterRepository.save(newRecruiter2);


        List<RecruiterInfo> listOfRec = recruiterRepository.findAll();
        assertEquals(2, listOfRec.size());

        List<RecruiterInfo> listOfRec2 = recruiterRepository.findByrecruiterFirstName("Carl");
            assertEquals(1, listOfRec2.size());

        List<RecruiterInfo> listOfRec3 = recruiterRepository.findByrecruiterFirstName("Mike");
        assertEquals(false, listOfRec3.contains("Mike"));


    }

    @Test
    void findByrecruiterPhoneNumber() {

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

        RecruiterInfo newRecruiter2 = new RecruiterInfo();

        newRecruiter2.setRecruiterFirstName("Carl");
        newRecruiter2.setRecruiterLastName("Baker");
        newRecruiter2.setRecruiterPhoneNumber("404-250-2486");
        newRecruiter2.setCompanyName("IBM");
        newRecruiter2.setDateLastSpokeTo(LocalDate.of(2020,01,30));
        newRecruiter2.setInterested(false);
        newRecruiter2.setNotes("Not so cool sounding job!");

        recruiterRepository.save(newRecruiter2);


        List<RecruiterInfo> listOfRec = recruiterRepository.findAll();
        assertEquals(2, listOfRec.size());

        List<RecruiterInfo> listOfRec2 = recruiterRepository.findByrecruiterPhoneNumber("404-250-2486");
        assertEquals(2, listOfRec2.size());


    }

    @Test
    void findBycompanyName() {

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

        RecruiterInfo newRecruiter2 = new RecruiterInfo();

        newRecruiter2.setRecruiterFirstName("Carl");
        newRecruiter2.setRecruiterLastName("Baker");
        newRecruiter2.setRecruiterPhoneNumber("404-250-2486");
        newRecruiter2.setCompanyName("IBM");
        newRecruiter2.setDateLastSpokeTo(LocalDate.of(2020,01,30));
        newRecruiter2.setInterested(false);
        newRecruiter2.setNotes("Not so cool sounding job!");

        recruiterRepository.save(newRecruiter2);


        List<RecruiterInfo> listOfRec = recruiterRepository.findAll();
        assertEquals(2, listOfRec.size());

        List<RecruiterInfo> listOfRec2 = recruiterRepository.findBycompanyName("IBM");
        assertEquals(1, listOfRec2.size());

        List<RecruiterInfo> listOfRec3 = recruiterRepository.findBycompanyName("NASA");
        assertEquals(1, listOfRec3.size());

        List<RecruiterInfo> listOfRec4 = recruiterRepository.findBycompanyName("Walmart");
        assertEquals(0, listOfRec4.size());

    }
}