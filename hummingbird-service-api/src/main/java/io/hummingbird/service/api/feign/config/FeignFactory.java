package io.hummingbird.service.api.feign.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.hummingbird.service.api.feign.client.RemoteSystemCfgService;

/**
 * Feign bean工厂类
 * 
 * @author kong
 *
 */
@Component
public class FeignFactory {

	/**
	 * 系统配置 通信接口
	 */
	public static RemoteSystemCfgService remoteCfgService;

	@Autowired
	public void setRemoteCfgService(RemoteSystemCfgService remoteCfgService) {
		FeignFactory.remoteCfgService = remoteCfgService;
	}

}
