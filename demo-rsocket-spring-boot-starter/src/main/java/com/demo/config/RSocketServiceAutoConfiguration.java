package com.demo.config;

import com.alibaba.rsocket.invocation.RSocketRemoteServiceBuilder;
import com.alibaba.rsocket.upstream.UpstreamManager;
import com.demo.common.service.GlobalItemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RSocketServiceAutoConfiguration {
    @Bean
    public GlobalItemService taskService(UpstreamManager upstreamManager) {
        return RSocketRemoteServiceBuilder
                .client(GlobalItemService.class)
                .upstreamManager(upstreamManager)
                .build();
    }


}
