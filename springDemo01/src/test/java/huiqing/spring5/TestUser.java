package huiqing.spring5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void testAdd(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext file = new ClassPathXmlApplicationContext("beanUser.xml");
        //2.获取配置创建的对象
        User user = file.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}
