package DemoLambda.demo;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
	public static void main(String[] args) {
		//使用数组存储多个Person对象
		Person[] arr = {
			new Person("李白", 23),
			new Person("张三", 18),
			new Person("李四", 20),
		};
		
		//对数组中的Person对象使用Arrays的sort方法通过年龄进行升序（前边-后边）排序
//		Arrays.sort(arr, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getAge()-o2.getAge();
//			}
//		});
		//使用lambda表达式
		Arrays.sort(arr, (o1,o2) ->{
			return o1.getAge()-o2.getAge();
		});

		
		//遍历数组
		for(Person person : arr) {
			System.out.println(person);
		}
		
	}
}
