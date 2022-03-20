package huiqing.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 注解扫面，可以创建这个BookDaoImpl的对象
 */
@Repository
public class BookDaoImpl implements BookDao{
    //注入jdbcTemplate
    @Autowired//自动注入
    private JdbcTemplate jdbcTemplate;
}
