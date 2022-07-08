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
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
        System.out.println("接口文档地址：http://localhost:8201/doc.html");
    }
}
