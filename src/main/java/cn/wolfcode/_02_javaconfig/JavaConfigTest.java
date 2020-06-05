package cn.wolfcode._02_javaconfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    @Test
    public void someBeanTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SomeBean someBean = applicationContext.getBean(SomeBean.class);
        System.out.println(someBean);
    }
}
