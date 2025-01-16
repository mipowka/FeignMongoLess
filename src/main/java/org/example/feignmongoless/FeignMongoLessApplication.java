package org.example.feignmongoless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignMongoLessApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignMongoLessApplication.class, args);
    }

}
