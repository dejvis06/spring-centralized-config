package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigClientApplication {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigClientApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(ConfigClientApplication.class, args);
        String configTest = ctx.getEnvironment().getProperty("test.message");
        LOG.info("Config from server: " + configTest);
    }

}
