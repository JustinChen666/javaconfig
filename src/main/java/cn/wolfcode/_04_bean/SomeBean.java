package cn.wolfcode._04_bean;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {
    public void init() {
        System.out.println("啊,我被创建了...");
    }

    public void destroy() {
        System.out.println("啊,我被干掉了...");
    }
}
