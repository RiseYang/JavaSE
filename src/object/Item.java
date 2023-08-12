package object;


/**
 * 
 * @ClassName: Item 
 * @Description: TODO
设计出物品这种类
 类名：Item
物品有如下属性:
名字 name 类型是字符串String
价格 price 类型是整型 int

创建(实例化)3件具体物品
名称 价格
血瓶 50
草鞋 300
长剑 350
 * @author: Administrator
 * @date: 2023年8月12日 上午11:32:39
 */
public class Item {
	String name;
	int price;
	public static void main(String[] args) {
		Item blood = new Item();
		blood.name="血瓶";
		blood.price=50;
		Item shoe = new Item();
		shoe.name = "草鞋";
		shoe.price= 300;
		Item sword = new Item();
		sword.name= "长剑";
		sword.price= 350;
	}
}
