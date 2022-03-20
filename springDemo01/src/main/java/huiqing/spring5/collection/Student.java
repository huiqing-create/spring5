package huiqing.spring5.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Student类用于学习注入  数组、list、map、set类型的属性
 */
public class Student {
    private String[] course;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;

    //在集合里面设置对象类型值---Course类的对象
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    //test方法用户测试打印
    public void test(){
        System.out.println(Arrays.toString(course));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(courseList);
    }

}
