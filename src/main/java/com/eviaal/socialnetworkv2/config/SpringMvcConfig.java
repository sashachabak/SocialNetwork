package com.eviaal.socialnetworkv2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/css/**", "/auth/assets/css/**")
                .addResourceLocations("classpath:/static/assets/css/");
        registry.addResourceHandler("/assets/js/**", "/auth/assets/js/**")
                .addResourceLocations("classpath:/static/assets/js/");
        registry.addResourceHandler("/assets/images/**", "/auth/assets/images/**")
                .addResourceLocations("classpath:/static/assets/images/");
        registry.addResourceHandler("/assets/fonts/**", "/auth/assets/fonts/**")
                .addResourceLocations("classpath:/static/assets/fonts/");
        registry.addResourceHandler("/assets/scss/**", "/auth/assets/scss/**")
                .addResourceLocations("classpath:/static/assets/scss/");
    }
}
