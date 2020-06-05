package cn.wolfcode._06_import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(OtherConfig.class)
public class ApplicationConfig {
    @Bean
    public SomeBean someBean(OtherBean otherBean) {
        SomeBean someBean = new SomeBean();
        someBean.setOtherBean(otherBean);
        return someBean;
    }
}
