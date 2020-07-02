package com.my.lapland.common.handler;

import com.alibaba.fastjson.JSONObject;
import com.my.lapland.common.entity.LaplandResponse;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yu.mei
 * @Description 处理资源服务器异常
 * @create 2020/6/1 23:41
 */
public class LaplandAuthExceptionEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        // 方法内自定义响应的格式
        LaplandResponse resp = new LaplandResponse();
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getOutputStream().write(JSONObject.toJSONString(resp.message("token无效")).getBytes());
    }
}