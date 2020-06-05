package cn.wolfcode._01_xmlconfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigTest {
    @Test
    public void someBeanTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeBean someBean = applicationContext.getBean(SomeBean.class);
        System.out.println(someBean);
    }
}
