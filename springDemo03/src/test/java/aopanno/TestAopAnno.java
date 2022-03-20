package aopanno;

import aopanno.config.ConfigClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopAnno {

    @Test
    public void testAopAnno(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopAnno.xml");
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigClass.class);
        User user = context.getBean("user", User.class);
        user.add();

    }
}
