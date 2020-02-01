package com.API.App.controller;

import com.API.App.dao.RecruiterRepository;
import com.API.App.model.RecruiterInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recruiters")
public class RecruiterController {

    @Autowired
    RecruiterRepository recruiterRepository;

    @PostMapping("/add")
    public RecruiterInfo createRecruiter(@RequestBody RecruiterInfo recruiterInfo){
        return recruiterRepository.save(recruiterInfo);
    }

    @GetMapping("/all")
    public List<RecruiterInfo> getAllRecruiters(){
        return recruiterRepository.findAll();
    }

    @GetMapping("/{recruiterId}")
    public RecruiterInfo findRecruiterById(@PathVariable Integer recruiterId){
        return recruiterRepository.findById(recruiterId).orElse(null);
    }

        @GetMapping("/{recruiterFirstName}")
        public List<RecruiterInfo> findByFirstName(@PathVariable String recruiterFirstName){
        return recruiterRepository.findByrecruiterFirstName(recruiterFirstName);
        }



    GetMapping("/{recruiterFirstName}")


}
