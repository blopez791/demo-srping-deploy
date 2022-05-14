package com.examplespringdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class DemoSrpingDeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key,value) -> System.out.println(key + " " + value)
		);
	}

}
