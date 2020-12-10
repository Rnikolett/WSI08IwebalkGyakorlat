package com.WSI08I.semTaskWSI08I;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SemtaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SemtaskApplication.class, args);
		
		System.out.println("Press 'Enter' to terminate");
        new Scanner(System.in).nextLine();
        System.out.println("Exiting");
        System.exit(1);
	}

}
