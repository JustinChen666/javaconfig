package cn.wolfcode._07_importsource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class ApplicationConfig {

    @Bean
    public SomeBean someBean(OtherBean otherBean){
        SomeBean someBean = new SomeBean();
        someBean.setOtherBean(otherBean);
        return someBean;
    }
}
