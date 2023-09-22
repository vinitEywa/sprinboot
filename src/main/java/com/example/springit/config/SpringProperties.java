package com.example.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringProperties {
    private String welcomemsg = "Hello World";

    public String getWelcomemsg() {
        return welcomemsg;
    }

    public void setWelcomemsg(String welcomemsg) {
        this.welcomemsg = welcomemsg;
    }
}
