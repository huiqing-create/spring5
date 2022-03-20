package huiqing.spring5.collention;

import huiqing.spring5.collection.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

    @Test
    public void testArrayListMapSet(){
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("studentCollection.xml");

        //2.创建对象
        Student student = context.getBean("student", Student.class);
        student.test();
    }
}
