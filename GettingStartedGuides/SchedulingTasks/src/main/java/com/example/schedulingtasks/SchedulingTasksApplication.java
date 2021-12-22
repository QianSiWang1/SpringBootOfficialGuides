package com.example.schedulingtasks;

/**
 * @author YuQian
 * @create 2021/12/22
 * @Description
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingTasksApplication.class);
    }
}