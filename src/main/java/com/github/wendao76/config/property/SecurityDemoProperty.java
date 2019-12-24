package com.github.wendao76.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 测试参数
 * @author wendao76
 */
@Data
@ConfigurationProperties(prefix = "demo")
public class SecurityDemoProperty {
    private String appName;
}
