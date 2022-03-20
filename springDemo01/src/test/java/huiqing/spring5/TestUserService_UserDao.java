package huiqing.spring5;

import huiqing.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService_UserDao {

    @Test
    public void testUserServiceUserDao() {
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("service_dao.xml");
        //2.用配置文件创建一个对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.function();
    }
}
