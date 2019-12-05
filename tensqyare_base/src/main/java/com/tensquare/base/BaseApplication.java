package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import utils.SnowflakeIdUtils;

/**
 * @author phm
 * @Description:
 * @date 2019/12/4 19:31
 */
@SpringBootApplication
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
        System.out.println("启动成功奥");
    }

    @Bean
    public SnowflakeIdUtils IdWorker() {
        return new SnowflakeIdUtils(1, 1);
    }

}
