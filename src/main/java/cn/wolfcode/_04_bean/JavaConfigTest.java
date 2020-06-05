package cn.wolfcode._04_bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class JavaConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void someBeanTest() {
        /*try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {
            SomeBean someBean = applicationContext.getBean(SomeBean.class);
            System.out.println(someBean);
        }*/
        SomeBean someBean = applicationContext.getBean(SomeBean.class);
        System.out.println(someBean);
    }
}
