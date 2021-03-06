package com.uxp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com"})
public class ApplicationConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("file:public/");
    }
    /*@Override
    public void addCorsMappings(CorsRegistry registry) {
		registry
			.addMapping("/**")
			//.allowedOrigins("http://xyz.com")
			.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
			.allowedHeaders("header1", "header2", "header3","header4", "header5", "header6", "header7", "header8", "header9","header10", "header11", "header12")
			.exposedHeaders("header1", "header2", "header3","header4", "header5", "header6", "header7", "header8", "header9","header10", "header11", "header12")
			.allowCredentials(false)
			.maxAge(36000);
			
	}*/
}
