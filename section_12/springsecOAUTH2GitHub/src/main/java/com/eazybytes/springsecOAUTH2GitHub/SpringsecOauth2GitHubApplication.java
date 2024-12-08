package com.eazybytes.springsecOAUTH2GitHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug = true)
public class SpringsecOauth2GitHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecOauth2GitHubApplication.class, args);
	}

}
