package cn.wolfcode._09_profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:test.properties")
@Profile("test")
public class TestConfig {

}
