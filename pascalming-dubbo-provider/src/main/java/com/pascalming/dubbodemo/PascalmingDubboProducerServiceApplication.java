package com.pascalming.dubbodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author yuming
 */
@SpringBootApplication(scanBasePackages = {"com.pascalming.dubbodemo.*"})
@EnableScheduling
public class PascalmingDubboProducerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PascalmingDubboProducerServiceApplication.class);
    }
}

