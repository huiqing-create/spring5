package huiqing.spring5.collention;

import huiqing.spring5.collection.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 把集合注入部分提取出来
 *在xml文件中使用 util 标签完成 list 集合注入提取
 */
public class TestListBook {
    public static void main(String[] args) {
    //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tiqujiheleixingshuxingzhuru.xml");
        Book book = context.getBean("book", Book.class);
        book.test();

    }
}
