package io.hummingbird.provider.service;

import org.apache.dubbo.config.annotation.DubboService;

import io.hummingbird.service.api.rpc.HelloService;

//@Path("/provider")
@DubboService(protocol = "dubbo", version = "1.1.0")
public class HelloServiceImpl implements HelloService {

	@Override
	// @Path("hello")
	// @GET
	public String sayHello(String name) {
		System.out.println("远程方法被调用");
		return "dsadadas";
	}

}
