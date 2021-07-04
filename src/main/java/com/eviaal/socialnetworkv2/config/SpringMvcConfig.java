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
        registry.addResourceHandler("/assets/css/**")
                .addResourceLocations("classpath:/static/assets/css/");
        registry.addResourceHandler("/assets/js/**")
                .addResourceLocations("classpath:/static/assets/js/");
        registry.addResourceHandler("/assets/images/**")
                .addResourceLocations("classpath:/static/assets/images/");
        registry.addResourceHandler("/assets/fonts/**")
                .addResourceLocations("classpath:/static/assets/fonts/");
        registry.addResourceHandler("/assets/scss/**")
                .addResourceLocations("classpath:/static/assets/scss/");
    }
}
