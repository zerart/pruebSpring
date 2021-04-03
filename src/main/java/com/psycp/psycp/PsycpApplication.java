package com.psycp.psycp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages={"com.psycp.psycp.mapper"})
public class PsycpApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsycpApplication.class, args);
	}

}
