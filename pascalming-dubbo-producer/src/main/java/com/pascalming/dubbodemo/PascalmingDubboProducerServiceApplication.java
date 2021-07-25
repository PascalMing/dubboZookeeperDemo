package com.pascalming.dubbodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuming
 */
@SpringBootApplication(scanBasePackages = {"com.pascalming.dubbodemo.*"})
public class PascalmingDubboProducerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PascalmingDubboProducerServiceApplication.class);
    }
}

