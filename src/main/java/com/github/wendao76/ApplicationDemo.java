package com.github.wendao76;

import com.github.wendao76.config.property.SecurityDemoProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * 说明：
 * 1. MapperScan结合MyBatis 否则无法生效
 * @author wendao76
 */
@SpringBootApplication
@ComponentScan(value={
	"com.github.wendao76.*",
})
@EnableConfigurationProperties(SecurityDemoProperty.class)
public class ApplicationDemo {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationDemo.class, args);
	}

}
