//package com.my.lapland.register.configure;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author yu.mei
// * @Description eureka服务保护配置
// * @create 2020/3/30 23:24
// */
//public class LaplandRegisterWebSecurityConfigure extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        this.logger.debug("Using default configure(HttpSecurity). If subclassed this will potentially override
////        subclass configure(HttpSecurity).");
////        ((HttpSecurity)((HttpSecurity)((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)http.authorizeRequests()
////        .anyRequest()).authenticated().and()).formLogin().and()).httpBasic();
//        http.csrf().ignoringAntMatchers("/eureka/**");
//        super.configure(http);
//    }
//}
