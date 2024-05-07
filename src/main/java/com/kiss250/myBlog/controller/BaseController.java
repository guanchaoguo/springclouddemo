package com.kiss250.myBlog.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author yazhou
 */
public class BaseController {
    protected Logger log = LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    private RedisHelper redisHelper;

    public HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }

//    public AccountLoginResp getUserInfoInCookies(){
//        String token  = StringUtils.isEmpty(this.getRequest().getHeader("x-token"))?this.getRequest().getHeader("token"):this.getRequest().getHeader("x-token");
//        String ioptoken  = !StringUtils.isEmpty(this.getRequest().getHeader("Ioptoken")) ? this.getRequest().getHeader("Ioptoken"): "";
//        if( !ioptoken.isEmpty() ) {
//            token = ioptoken;
//        }
//
//        if(StringUtils.isEmpty(token)) {
//            throw new BusException("504", "登录已失效，请重新登录");
//        }
//        String redisUserInfo = redisHelper.get(token);
//        if(Objects.nonNull(redisUserInfo)){
//            JSONObject jsonObject = JSONObject.parseObject(redisUserInfo);
//            AccountLoginResp userInfo = JSONObject.toJavaObject(jsonObject, AccountLoginResp.class);
//            if(userInfo ==null){
//                log.info("获取用户信息异常1：【{}】",token);
//                throw new BusException("504", "登录信息已失效，请重新登录");
//            }
//            return userInfo;
//        }else{
//            log.info("获取用户信息异常2：【{}】",token);
//            throw new BusException("504", "登录信息已失效，请重新登录");
//        }
//    }
}
