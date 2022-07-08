package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author az
 * @description
 * @date 2022/7/2 0002
 */
@SpringBootApplication
@MapperScan("com.test.mapper")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        System.out.println("接口文档地址：http://localhost:8101/doc.html");
    }

}
