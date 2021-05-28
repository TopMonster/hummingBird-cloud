package io.hummingbird.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hummingbird.service.api.rpc.HelloService;

/**
 * Controller -- 系统管理员表
 * 
 * @author kong
 */
@RestController
@RequestMapping("/test/")
public class SpAdminController {

	@DubboReference(version = "1.1.0", protocol = "dubbo")
	private HelloService restService;

	// 增
	@RequestMapping("test")
	public String add() {
		return restService.sayHello("dsa");
	}

}
