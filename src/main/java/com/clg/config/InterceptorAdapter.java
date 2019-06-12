package com.clg.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author 小台
 * @Date 2019/4/3011:18
 */
@Configuration
public class InterceptorAdapter extends WebMvcConfigurerAdapter {

    @Autowired
    private TestHandlerInterceptor TestHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(TestHandlerInterceptor).addPathPatterns("/**");
        super.addInterceptors(registry);
    }


}