package huiqing.spring5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpDept {

    @Test
    public void testEmpDept(){
        //1.加载配置文件
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dept_emp.xml");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dept_emp_jilianfuzhi01.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dept_emp_jilianfuzhi02.xml");
        //2.创建对象
        Emp emp = context.getBean("emp", Emp.class);
        //获取到Demp类的相关信息
        System.out.println(emp.getDept().getDname());
        //获取自身类相关属性
        System.out.println(emp.getEname());
        System.out.println(emp.getGender());
    }
}
