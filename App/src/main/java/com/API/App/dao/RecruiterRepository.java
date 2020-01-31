package com.API.App.dao;


import com.API.App.model.RecruiterInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruiterRepository  extends JpaRepository<RecruiterInfo, Integer> {


    List<RecruiterInfo> findByFirstName(String recruiterFirstName);
    List<RecruiterInfo> findByPhoneNumber(String recruiterPhoneNumber);
    List<RecruiterInfo> findByCompany(String companyName);

}
