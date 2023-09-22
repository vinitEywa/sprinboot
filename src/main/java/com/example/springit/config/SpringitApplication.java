package com.example.springit.config;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringitApplication {
    private static final Logger log = (Logger) LoggerFactory.getLogger(SpringitApplication.class);
    public static void main(String[] args){
        SpringitApplication.run(SpringitApplication.class,args);
    }

    private static void run(Class<SpringitApplication> springitApplicationClass, String[] args) {

    }
}