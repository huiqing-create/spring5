package huiqing.service;


import huiqing.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


//在注解里面的value值可以不写默认是类名称，只不过类名称是首字母小写--userService


@Service(value = "userService")  //这个注解就相当于<bean id = "userService" class"..."/>
public class UserService {

    @Value(value = "abc")//@Value注解是注入普通属性
    private String name;


    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired //根据类型进行注入
//    @Qualifier(value = "userDaoImpl")//@Qualifier和@Autowired一起使用，不要忘了
    //@Resource 这个注解可以根据名字也可以根据类型进行注入
//    @Resource//根据类型
    @Resource(name = "userDaoImpl")//根据名字
    private UserDao userDao;



    public void add(){
        System.out.println("service add....."+ name);
        userDao.add();

    }
}
