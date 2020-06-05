package cn.wolfcode._06_import;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class JavaConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void someBeanTest(){
        SomeBean someBean = applicationContext.getBean(SomeBean.class);
        OtherBean otherBean = applicationContext.getBean(OtherBean.class);
        System.out.println(someBean);
        System.out.println(otherBean);
        System.out.println(someBean.getOtherBean());
    }
}
