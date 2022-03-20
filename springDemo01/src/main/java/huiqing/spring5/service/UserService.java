package huiqing.spring5.service;

import huiqing.spring5.dao.UserDao;

public class UserService {
    //创建UserService类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void function(){
        System.out.println("service's function ........");
        userDao.update();
    }
}
