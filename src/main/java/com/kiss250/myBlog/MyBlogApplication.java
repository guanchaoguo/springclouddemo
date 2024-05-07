package com.kiss250.myBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan("com.kiss250.myBlog.mapper")
@EnableTransactionManagement
@EnableFeignClients
@EnableAsync
public class MyBlogApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyBlogApplication.class, args);
    }

}
