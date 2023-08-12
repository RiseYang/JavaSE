package gather;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @ClassName: KeySetTest 
 * @Description: TODO  keySet使用，通过key找到对应value
 * @author: yang
 * @date: 2023年8月12日 下午7:11:37
 */
public class KeySetTest {
	public static void main(String[] args) {
		//创建map集合对象
		HashMap<String, Integer> map = new HashMap<>();
		map.put("张三", 18);
		map.put("李四", 25);
		map.put("王二", 26);
		
		//使用keySet方法
		Set<String> keySet = map.keySet();
		//使用迭代器遍历key
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			//通过map集合中的方法get(key)方法，通过key找到value
			Integer value = map.get(key);
			System.out.println(key+","+value);
		}
	}
}
