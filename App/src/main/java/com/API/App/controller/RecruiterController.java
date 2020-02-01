package com.API.App.controller;

import com.API.App.dao.RecruiterRepository;
import com.API.App.model.RecruiterInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recruiters")
public class RecruiterController {

    @Autowired
    RecruiterRepository recruiterRepository;

    @PostMapping("/add")
    public RecruiterInfo createRecruiter(@RequestBody RecruiterInfo recruiterInfo){
        return recruiterRepository.save(recruiterInfo);
    }


}
