package cn.wolfcode._05_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public SomeBean someBean(OtherBean otherBean) {
        SomeBean someBean = new SomeBean();
        someBean.setOtherBean(otherBean);
        return someBean;
    }

    @Bean
    public OtherBean otherBean() {
        return new OtherBean();
    }
}
