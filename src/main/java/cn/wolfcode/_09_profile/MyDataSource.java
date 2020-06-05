package cn.wolfcode._09_profile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MyDataSource {
    private String username;
    private String password;
    private String url;
    private String driverClassName;
}
