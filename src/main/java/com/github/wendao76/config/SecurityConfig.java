package com.github.wendao76.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * spring安全框架测试
 * @author wendao76
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * 1. 根目录默认不受限
         */
        http.authorizeRequests().antMatchers("/").permitAll()
                .anyRequest().authenticated().and()
            .formLogin()
            .permitAll()
            .and()
            .logout()
            .permitAll();
    }
}
