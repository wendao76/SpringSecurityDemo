package com.github.wendao76.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class GlobalConfig {
    @Bean(name = "messageSource")
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
        rb.setBasename("messages");
        return rb;
    }
}
