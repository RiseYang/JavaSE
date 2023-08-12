package gather;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @ClassName: EntrySetTest 
 * @Description: TODO 用entrySet遍历获取键值对
 * @author: Administrator
 * @date: 2023年8月12日 下午6:47:14
 */
public class EntrySetTest {
	public static void main(String[] args) {
		//创建Map集合对象
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 18);
		map.put("李四", 25);
		map.put("王二", 26);
		//使用map中的entrySet方法，把map集合多个Entry对象取出来，存到set集合中
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		
		//使用迭代器遍历set集合
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> next = it.next();
			//取key value值
			String key = next.getKey();
			Integer value = next.getValue();
			System.out.println(key+","+value);
			
		}
	}

}
