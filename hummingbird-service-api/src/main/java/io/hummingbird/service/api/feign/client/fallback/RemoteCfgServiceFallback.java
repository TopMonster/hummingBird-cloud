package io.hummingbird.service.api.feign.client.fallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
import io.hummingbird.service.api.feign.client.RemoteSystemCfgService;

/**
 * 系统配置 服务降级处理
 * 
 *
 */
@Component
public class RemoteCfgServiceFallback implements FallbackFactory<RemoteSystemCfgService> {

	private static final Logger log = LoggerFactory.getLogger(RemoteCfgServiceFallback.class);

	/**
	 * 服务降级时触发的方法
	 */
	@Override
	public RemoteSystemCfgService create(Throwable cause) {

		log.error("--------------------系统配置服务异常，触发降级: {}", cause.getMessage());

		// 返回熔断后的对象
		return new RemoteSystemCfgService() {

			@Override
			public String getServerCfg(String key, String defaultValue) {
				return defaultValue;
			}

		};
	}

}
