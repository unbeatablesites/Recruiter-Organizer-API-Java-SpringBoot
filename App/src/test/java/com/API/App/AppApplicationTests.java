package com.API.App;

import com.API.App.dao.RecruiterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class AppApplicationTests {

	@Autowired
	RecruiterRepository recruiterRepository;

	@Test
	void contextLoads() {
	}

}
