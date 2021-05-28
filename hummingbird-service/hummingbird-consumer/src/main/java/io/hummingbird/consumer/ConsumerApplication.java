package io.hummingbird.consumer;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * 启动类
 * 
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
@SpringBootConfiguration
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class);
	}

	@Bean
	public ApplicationRunner callRunner() {
		return arguments -> {
			// callAll();
		};
	}

	private void callAll() {

		// String s = restService.sayHello("dsadsa");
		// System.out.println(s);
	}
}
