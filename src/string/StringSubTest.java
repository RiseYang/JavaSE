package string;
/**
 * 
 * @ClassName: StringSubTest 
 * @Description: TODO 字符串截取
 * @author: Yang
 * @date: 2023年8月12日 上午11:41:09
 */
public class StringSubTest {
	public static void main(String[] args) {
		String s = "我是中ab国人";
		byte[] str = s.getBytes();
		//截取字符串 我
		String substring1 = s.substring(0, 1);		
		//截取字符串 是
	    String substring2 = s.substring(1, 2);
		//截取字符串 中
		String substring3 = s.substring(2, 3);
		//截取字符串 a
		String substring4 = s.substring(3, 4);
		//截取字符串 b
		String substring5 = s.substring(4, 5);
		//截取字符串 国
		String substring6 = s.substring(5, 6);
		//截取字符串 人
		String substring7 = s.substring(6, 7);
		//打印对象
		System.out.println(substring1);
		System.out.println(substring2);
		System.out.println(substring3);
		System.out.println(substring4);
		System.out.println(substring5);
		System.out.println(substring6);
		System.out.println(substring7);
		
	}
}
