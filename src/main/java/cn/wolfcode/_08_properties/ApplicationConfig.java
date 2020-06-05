package cn.wolfcode._08_properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class ApplicationConfig {
    /**
     * 从spring环境中取值,设置到字段上
     */
    /*@Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driverClassName}")
    private String driverClassName;*/

    @Bean
    public MyDataSource myDataSource(Environment environment) {
        MyDataSource myDataSource = new MyDataSource();
        myDataSource.setUsername(environment.getProperty("jdbc.username"));
        myDataSource.setPassword(environment.getProperty("jdbc.password"));
        myDataSource.setUrl(environment.getProperty("jdbc.url"));
        myDataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
        return myDataSource;
    }

    @Bean
    public OtherBean otherBean() {
        return new OtherBean();
    }

    @Bean
    public SomeBean someBean() {
        return new SomeBean();
    }

    /**
     * PropertySourcesPlaceholderConfigurer:在所有的bean创建好之后去替换@Vlaue("${jdbc.password}")
     * static:让它在所有的bean创建在会话之前
     * @return
     */
    /*@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }*/
}
