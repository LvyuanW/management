package com.ziang.management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String basePath = System.getProperty("user.dir").replace("\\", "/");
        String resourcePath = "file:" + basePath + "/media/uploads/";
        registry.addResourceHandler("/media/uploads/**")
                .addResourceLocations(resourcePath);
    }
}
