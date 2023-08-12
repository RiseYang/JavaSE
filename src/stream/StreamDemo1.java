package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 panyang
 * @创建时间 4/8/2023
 * @描述
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王二");
        list.add("张启强");
        list.add("李华");
        list.add("小红");
        list.add("张十一");
        list.stream().filter(name -> name.startsWith("张"))
                     .filter(name ->name.length()==3)
                     .forEach(name -> System.out.println(name));

    }
}
