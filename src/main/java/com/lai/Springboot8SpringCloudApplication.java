package com.lai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer  //启动一个服务注册中心
public class Springboot8SpringCloudApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Springboot8SpringCloudApplication.class, args);
		new SpringApplicationBuilder(Springboot8SpringCloudApplication.class).web(true).run(args);
	}
}
