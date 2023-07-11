package com.ajie.train.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ajie
 * @date 2023/7/10
 * @description:
 */
@SpringBootApplication
@ComponentScan(value = {"com.ajie.train"})
public class MemberApplication {
    private static final Logger logger = LoggerFactory.getLogger(MemberApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
        logger.info("会员模块启动成功！");
    }
}
