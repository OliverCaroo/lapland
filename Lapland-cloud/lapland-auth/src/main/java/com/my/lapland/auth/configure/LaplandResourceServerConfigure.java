package com.my.lapland.auth.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author yu.mei
 * @Description auth资源服务器
 * 认证服务器本身也可以对外提供REST服务，比如通过Token获取当前登录用户信息，注销当前Token等，所以它也是一台资源服务器。
 * @EnableResourceServer用于开启资源服务器相关配置
 * @create 2020/3/30 23:54
 */
@Configuration
@EnableResourceServer
public class LaplandResourceServerConfigure extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/**").authenticated();
    }
}
