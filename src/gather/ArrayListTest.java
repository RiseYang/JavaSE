package gather;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @ClassName: ArrayListTest 
 * @Description: TODO 生成1-33之间的随机整数，并遍历集合
 * @author: yang
 * @date: 2023年8月12日 下午6:33:03
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//创建一个ArrayList集合
		ArrayList<Integer> list = new ArrayList<Integer>();
		//创建一个Random随机对象
		Random random = new Random();
		//取数
		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(33)+1;
			list.add(num);
		}
		//遍历num元素
		for (int i = 0; i < list.size(); i++) {
			//get num元素
			System.out.println(list.get(i));
		}
	}
}
