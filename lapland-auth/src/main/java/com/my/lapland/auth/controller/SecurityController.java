package com.my.lapland.auth.controller;

import com.my.lapland.common.LaplandResponse;
import com.my.lapland.common.exception.LaplandException;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class SecurityController {

    private final ConsumerTokenServices consumerTokenServices;

    @GetMapping("oauth/test")
    public String testOauth() {
        return "oauth";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @DeleteMapping("signout")
    public LaplandResponse signout(HttpServletRequest request) throws LaplandException {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
        LaplandResponse febsResponse = new LaplandResponse();
        if (!consumerTokenServices.revokeToken(token)) {
            throw new LaplandException("退出登录失败");
        }
        return febsResponse.message("退出登录成功");
    }
}
