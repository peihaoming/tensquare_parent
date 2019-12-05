package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import utils.SnowflakeIdUtils;

/**
 * @author phm
 * @Description:
 * @date 2019/12/4 19:40
 */
@Configuration
public class BaseConfig {

    @Bean
    public SnowflakeIdUtils IdWorker() {
        return new SnowflakeIdUtils(1, 1);
    }
}
