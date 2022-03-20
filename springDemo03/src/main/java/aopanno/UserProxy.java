package aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect //生成代理对象
@Order(2)
public class UserProxy {


    /**
     * 抽取相同切入点
     */
    @Pointcut(value = "execution(* aopanno.User.add(..))")//因为下面的切入点是一样的我们现在用这个注解抽取一下，下面那个方法就相当于一个名字，就是为了引用
    public void pointcutDemo(){

    }


    //前置 通知
    //@Before 注解表示前置通知,就是在你的要增强的方法之前执行
    @Before(value = "pointcutDemo()")
    public void Before(){
        System.out.println("before........");
    }
    //后置通知(返回通知)
    @After(value = "pointcutDemo()")
    public void after(){
        System.out.println("after......");
    }

    /**
     * 当有异常发生时afterThorwing通知执行，after通知不执行
     */
    //异常通知
    @AfterThrowing(value = "pointcutDemo()")
    public void afterThorwing(){
        System.out.println("afterThorwing.......");
    }
    //环绕通知，在增强的方法之前和之后都执行
    @Around(value = "pointcutDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");//环绕之前比before执行的还早

        proceedingJoinPoint.proceed();//这就话是调用执行那个被增强的方法，这里是add（）。

        System.out.println("环绕之后");//环绕之后比after执行的还晚


    }

}
