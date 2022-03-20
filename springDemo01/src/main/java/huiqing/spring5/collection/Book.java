package huiqing.spring5.collection;

import java.util.List;

public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    /**
     * 测试时要用到的方法
     */
    public void test(){
        System.out.println(list);
    }
}
