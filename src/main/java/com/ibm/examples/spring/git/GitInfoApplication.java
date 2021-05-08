package com.ibm.examples.spring.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication(scanBasePackages = { "com.ibm.examples.spring.git" } )
public class GitInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitInfoApplication.class, args);
	}

	 @Bean
	    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
	        PropertySourcesPlaceholderConfigurer propsConfig 
	          = new PropertySourcesPlaceholderConfigurer();
	        propsConfig.setLocation(new ClassPathResource("git.properties"));
	        propsConfig.setIgnoreResourceNotFound(true);
	        propsConfig.setIgnoreUnresolvablePlaceholders(true);
	        return propsConfig;
	    }
}
