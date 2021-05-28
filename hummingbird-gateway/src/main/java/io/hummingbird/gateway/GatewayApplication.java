package io.hummingbird.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * gateway 服务网关-启动
 * 
 * @author kong
 */
@EnableDiscoveryClient // 注册中心
@SpringBootApplication // SpringBoot注解
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
		System.out.println("\n--------------- GatewayApplication 服务网关启动成功 ---------------\n");
	}

}
