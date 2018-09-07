package com.rajan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MySpringCloudConfigServerJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringCloudConfigServerJdbcApplication.class, args);
	}
}
