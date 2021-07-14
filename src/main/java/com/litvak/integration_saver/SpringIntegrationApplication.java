package com.litvak.integration_saver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;

import java.util.Collections;

@SpringBootApplication
@IntegrationComponentScan
public class SpringIntegrationApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication app = new SpringApplication(SpringIntegrationApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8090"));
        app.run(args);

    }

}
