package com.bdi.sb.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/static/**") // /res 으로 시작하는 요청이 오면
	                .addResourceLocations("classpath:/static/") // static 디렉토리 밑에서 제공
	                .setCachePeriod(20); // 20초
    }
}