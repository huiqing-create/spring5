package huiqing.spring5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testBook(){

        //1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanBook.xml");
        //2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book.getBname());
        System.out.println(book.getBauthor());
    }
}
