package cn.wolfcode._05_di;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@Getter
public class SomeBean {
    private OtherBean otherBean;
}
