package com.psycp.psycp;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.psycp.psycp.persistence.mapper"})
public class PsycpApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsycpApplication.class, args);
	}

}
