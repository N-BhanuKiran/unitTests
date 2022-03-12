package com.practise.unittests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

@SpringBootTest
class UnittestsApplicationTests {

	@Test
	void contextLoads() {
		Date date = new Date();
		System.out.println(date);
		System.out.println(new Date().compareTo(new Date()));
		assertThat(date).isNotNull();	
	}

	@Test
	void collectionTest() {
		List<String> users = new ArrayList<String>();
		if (CollectionUtils.isEmpty(users)) {
			users.add("arg0");
		} else {
			System.out.println("this will never be printed");
		}
		assertThat(users.size()).isGreaterThan(0);
	}

}
