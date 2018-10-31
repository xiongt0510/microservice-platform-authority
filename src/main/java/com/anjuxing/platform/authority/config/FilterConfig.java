package com.anjuxing.platform.authority.config;

import com.anjuxing.platform.authority.filter.AclControlFilter;
import com.anjuxing.platform.authority.filter.LoginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiongt
 * @Description
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean loginFilterBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new LoginFilter());
        registrationBean.addUrlPatterns("/sys/*","/admin/*");
        registrationBean.setName("loginFilter");
        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean aclControlFilterBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new AclControlFilter());
        registrationBean.addUrlPatterns("/sys/*","/admin/*");
        registrationBean.setName("aclControlFilter");
        Map<String,String> initParamMap = new HashMap<>();
        initParamMap.put("targetFilterLifecycle","true");
        initParamMap.put("exclusionUrls","/sys/user/noAuth,/login,/test");
        registrationBean.setInitParameters(initParamMap);
        registrationBean.setOrder(10);
    return registrationBean;
    }

}
