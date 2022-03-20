package huiqing.spring5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestOrders {

    @Test
    public void testOrders(){
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanOrders.xml");
        //2.获取配置文件创建对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders.getOname());
        System.out.println(orders.getOaddress());

    }


}
