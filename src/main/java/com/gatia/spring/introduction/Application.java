package com.gatia.spring.introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm();
		System.out.println(binarySearchAlgorithm.binarySearch(new int[] {3,1,4,2,5},2));
	}

}
