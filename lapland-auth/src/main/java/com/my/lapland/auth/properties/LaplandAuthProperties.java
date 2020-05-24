package com.my.lapland.auth.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author yu.mei
 * @Description LaplandAuthProperties
 * @create 2020/5/24 19:23
 */
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:lapland-auth.properties"})
@ConfigurationProperties(prefix = "lapland.auth")
public class LaplandAuthProperties {
//    /**
//     * 验证码配置
//     */
//    private LaplandValidateCodeProperties code = new LaplandValidateCodeProperties();
//    /**
//     * JWT加签密钥
//     */
//    private String jwtAccessKey;
//    /**
//     * 是否使用 JWT令牌
//     */
//    private Boolean enableJwt;
//
//    /**
//     * 社交登录所使用的 Client
//     */
//    private String socialLoginClientId;

    private LaplandClientsProperties[] clients = {};
    private int accessTokenValiditySeconds = 60 * 60 * 24;
    private int refreshTokenValiditySeconds = 60 * 60 * 24 * 7;
}
