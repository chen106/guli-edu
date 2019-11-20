package com.atguigu.guli.service.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chen
 * @date 2019/11/20/17:29
 */
@SpringBootApplication
@ComponentScan({"com.atguigu.guli"})
public class ServiceEduApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEduApplication.class, args);
    }
}
