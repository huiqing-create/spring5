package huiqing.spring5.autoWire;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

    @Test
    public void testAutowire(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autoWire.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }


}
