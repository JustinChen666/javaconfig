package cn.wolfcode._04_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean(name = "sameBean",initMethod = "init",destroyMethod = "destroy")
    public SomeBean someBean() {
        return new SomeBean();
    }
}
