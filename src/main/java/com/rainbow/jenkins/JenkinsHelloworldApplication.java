package com.rainbow.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//步骤3：继承SpringBootServletInitializer类
@SpringBootApplication
//开启通用注解扫描  
@ComponentScan
public class JenkinsHelloworldApplication extends SpringBootServletInitializer{
	
	/** 
     * 步骤4:实现SpringBootServletInitializer可以让spring-boot项目在web容器中运行 
     */  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
        builder.sources(this.getClass());  
        return super.configure(builder);  
    }

	public static void main(String[] args) {
		SpringApplication.run(JenkinsHelloworldApplication.class, args);
	}
}
