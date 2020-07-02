package com.my.lapland.common.handler;

import com.my.lapland.common.entity.LaplandResponse;
import com.my.lapland.common.utils.AuthUtil;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yu.mei
 * @Description 处理403类型异常
 * @create 2020/6/1 23:47
 */
public class LaplandAccessDeniedHandler implements AccessDeniedHandler {

    //common模块是普通的maven项目，并不是一个Spring Boot项目，所以即使在这两个类上使用@Component注解标注，
    // 也不能被成功注册到各个微服务子系统的Spring IOC容器中。我们可以使用@Enable模块驱动的方式来解决这个问题
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException {
        LaplandResponse resp = new LaplandResponse();
        AuthUtil.makeResponse(
                response, MediaType.APPLICATION_JSON_UTF8_VALUE,
                HttpServletResponse.SC_FORBIDDEN, resp.message("没有权限访问该资源"));
    }
}