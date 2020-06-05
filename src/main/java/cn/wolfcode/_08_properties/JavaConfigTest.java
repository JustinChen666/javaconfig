package cn.wolfcode._08_properties;

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
    public void someBeanTest() {
        MyDataSource myDataSource = applicationContext.getBean(MyDataSource.class);
        System.out.println(myDataSource);
    }
}
