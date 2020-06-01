package com.my.lapland.common.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description AuthUtil
 * @author yu.mei
 * @create 2020/6/1 23:49
 */
public class AuthUtil {

    /**
     * 设置响应
     *
     * @param response    HttpServletResponse
     * @param contentType content-type
     * @param status      http状态码
     * @param value       响应内容
     * @throws IOException IOException
     */
    public static void makeResponse(HttpServletResponse response, String contentType,
                                    int status, Object value) throws IOException {
        response.setContentType(contentType);
        response.setStatus(status);
        response.getOutputStream().write(JSONObject.toJSONString(value).getBytes());
    }
}
