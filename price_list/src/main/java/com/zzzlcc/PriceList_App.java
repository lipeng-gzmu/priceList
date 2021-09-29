package com.zzzlcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zzzlcc.dao")
public class PriceList_App {
    public static void main(String[] args) {
        SpringApplication.run(PriceList_App.class,args);
    }
}
