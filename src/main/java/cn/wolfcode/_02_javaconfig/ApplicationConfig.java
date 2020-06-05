package cn.wolfcode._02_javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:spring的配置标签,打在某个类上,该类就可以被识别为spring的配置类
 */
@Configuration
public class ApplicationConfig {

    /**
     * @Bean:打在方法上,该方法返回的实例交给spring容器管理
     */
    @Bean
    public SomeBean someBean() {
        return new SomeBean();
    }
}
