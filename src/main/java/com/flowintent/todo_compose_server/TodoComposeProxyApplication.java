package com.flowintent.todo_compose_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
@EnableFeignClients
public class TodoComposeProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoComposeProxyApplication.class, args);
	}

}
