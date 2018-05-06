package com.prajaram.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = { "com.prajaram.elasticsearch" })
public class MsElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsElasticsearchApplication.class, args);
	}
}
