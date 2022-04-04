package com.gatia.spring.introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		BinarySearchImpl binarySearchAlgorithm = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchAlgorithm.binarySearch(new int[] {3,1,4,2,5},2);
		System.out.println(result);
	}

}
