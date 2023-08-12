package gather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @ClassName: IteratorTest 
 * @Description: TODO Iterator迭代器遍历
 * @author: yang
 * @date: 2023年8月12日 下午6:06:09
 */
public class IteratorTest {
	public static void main(String[] args) {
		//创建一个ArrayList集合
		List<String> list = new ArrayList<>();
		//添加元素
		list.add("阿里");
		list.add("百度");
		list.add("腾讯");
		list.add("网易");
		list.add("京东");
		list.add("美团");
		//创建一个Iterator迭代器
		Iterator<String> it = list.iterator();
		//遍历list元素
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
			
		}
	}

}
