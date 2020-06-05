package cn.wolfcode._09_profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

@Configuration
@Import({DevConfig.class, TestConfig.class})
public class ApplicationConfig {
    @Bean
    public MyDataSource myDataSource(Environment environment) {
        MyDataSource myDataSource = new MyDataSource();
        myDataSource.setUsername(environment.getProperty("jdbc.username"));
        myDataSource.setPassword(environment.getProperty("jdbc.password"));
        myDataSource.setUrl(environment.getProperty("jdbc.url"));
        myDataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
        return myDataSource;
    }
}
