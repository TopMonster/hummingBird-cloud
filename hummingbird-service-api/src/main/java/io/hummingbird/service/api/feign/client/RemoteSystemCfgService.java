package io.hummingbird.service.api.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.hummingbird.service.api.feign.FeignInterceptor;
import io.hummingbird.service.api.feign.client.fallback.RemoteCfgServiceFallback;
import io.hummingbird.service.api.feign.constants.FeignConsts;

/**
 * 系统配置 服务
 * 
 */
@FeignClient(name = FeignConsts.HUMMINGBIRD_SYSTEM, // 服务名称
		configuration = FeignInterceptor.class, // 请求拦截器
		fallbackFactory = RemoteCfgServiceFallback.class // 服务降级
)
public interface RemoteSystemCfgService {

	// 获取server端指定配置信息
	@RequestMapping("/SpCfgApi/getServerCfg")
	public String getServerCfg(@RequestParam("key") String key, @RequestParam("defaultValue") String defaultValue);

}
