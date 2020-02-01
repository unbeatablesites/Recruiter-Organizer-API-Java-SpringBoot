package com.API.App.controller;

import com.API.App.dao.RecruiterRepository;
import com.API.App.model.RecruiterInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/recruiters")
public class RecruiterController {
    private static final Logger logger = LoggerFactory.getLogger(RecruiterController.class);
    @Autowired
    RecruiterRepository recruiterRepository;

    @GetMapping("/add")
    public ModelAndView createUserView() {
        ModelAndView modelAndView = new ModelAndView("creatRecruiter");
        modelAndView.addObject("userRecruiter", new RecruiterInfo());
        modelAndView.addObject("allProfiles", getAllRecruiters());
        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView createRecruiter(@RequestBody RecruiterInfo recruiterInfo , BindingResult result){
       ModelAndView modelAndView = new ModelAndView();

//        if (result.hasErrors()) {
////            logger.info("Validation errors while submitting form.");
//            modelAndView.setViewName("creatRecruiter");
//            modelAndView.addObject("userRecruiter", recruiterInfo);
//            return modelAndView;
//        }
        recruiterRepository.save(recruiterInfo);
        modelAndView.addObject("allRecruiter", recruiterRepository.findAll());
        modelAndView.setViewName("userinfo");

        return modelAndView;
    }

    @GetMapping("/all")
    public List<RecruiterInfo> getAllRecruiters(){
        return recruiterRepository.findAll();
    }

    @GetMapping("/{recruiterId}")
    public RecruiterInfo findRecruiterById(@PathVariable Integer recruiterId){
        return recruiterRepository.findById(recruiterId).orElse(null);
    }

    @GetMapping("/names/{recruiterFirstName}")
    public List<RecruiterInfo> findByFirstName(@PathVariable String recruiterFirstName){
        return recruiterRepository.findByrecruiterFirstName(recruiterFirstName);
        }

    @GetMapping("/phone/{recruiterPhoneNumber}")
    public List<RecruiterInfo> findByPhoneNumber(@PathVariable String recruiterPhoneNumber){
        return recruiterRepository.findByrecruiterPhoneNumber(recruiterPhoneNumber);
    }

    @PutMapping("/updateRecruiter")
    public RecruiterInfo updateRecruiter(@RequestBody RecruiterInfo recruiterId){
        return recruiterRepository.save(recruiterId);
    }

    @DeleteMapping("/deleteRecruiter/{recruiterId}")
    public void removeRecruiter(@PathVariable Integer recruiterId){
        recruiterRepository.deleteById(recruiterId);
    }

}
