package huiqing.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest01 {
    public static void main(String[] args) {
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationTest01.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
