package aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) //设置对同一个方法增强时 类之间执行的顺序
public class PersonProxy {


    @Before(value = "execution(* aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("Person Before.........");
    }
}
