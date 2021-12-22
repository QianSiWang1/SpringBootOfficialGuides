package com.example.comsumingrest;

/**
 * @author YuQian
 * @create 2021/12/22
 * @Description
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    /**以下内容由于网络原因会timeout
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "https://quoters.apps.pcfone.io/api/random", Quote.class);
            log.info(quote.toString());
        };
    }*/


    //以下任务会在Spring启动后执行
    @Bean
    public CommandLineRunner runner(RestTemplate restTemplate) throws Exception {
        return args -> {
            System.out.println("hello,after init");
        };
    }

    //这个方式是在启动类上实现CommandLineRunner接口然后重写run方法
    @Override
    public void run(String[] args) throws Exception {
        System.out.println("2:commandLineRunner implement");
    }
}
