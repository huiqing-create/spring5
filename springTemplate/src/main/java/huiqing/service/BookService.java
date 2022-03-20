package huiqing.service;

import huiqing.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 注解扫描，使用注解就可以创建这个类
 */
@Service
public class BookService {

    //注入bookDao属性
    @Autowired
    private BookDao bookDao;
}
