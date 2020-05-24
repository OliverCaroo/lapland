package com.my.lapland.auth.properties;

import lombok.Data;

/**
 * @author yu.mei
 * @Description LaplandClientsProperties
 * @create 2020/5/24 19:31
 */
@Data
public class LaplandClientsProperties {

    private String client;
    private String secret;
    private String grantType = "password,authorization_code,refresh_token";
    private String scope = "all";
}
