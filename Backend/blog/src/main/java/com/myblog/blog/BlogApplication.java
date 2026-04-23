package com.myblog.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication

@EntityScan(basePackages = {"com.myblog.blog.*"})

@ComponentScan(basePackages = {"com.myblog.*"})
@EnableJpaRepositories(basePackages = {"com.myblog.blog.*", "com.myblog.blog.*"})
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}
