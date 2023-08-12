package object;

/**
 * 
 * @ClassName: Hero 
 * @Description: TODO
 * @author: Yang
 * @date: 2023年8月12日 上午11:28:52
 */
/*
 * 一个英雄可以有名称，血量，护甲，移动速度，还有 其他你想到的，作为新的属性，加入到英雄上面

比如送了多少次
杀人次数
助攻次数
金钱
补刀数
攻击速度
杀人后说的话
被杀后说的话*/
public class Hero {
	String name; //英雄姓名
	float hp;   // 英雄血量
	float armor;// 英雄护甲
    int moveSpeed; //移动速度
    int deaths; //死亡次数
    int helps;  //助攻次数
    int money; //金钱
    int attckSpeed; //攻击速度
    String killTalk; //杀人说的话
    String dieTalk;// 被杀说的话
    
    
    void dieTalk() {//无参数，无返回类型
    	System.out.println("黑化后的亚瑟！");
    }
    int getMoveSpeed() { //无参数， 有返回类型
    	return moveSpeed; 
    }
    void addAttck(int attck) {//有参数类型int 攻速+攻击力
    	attckSpeed = attckSpeed +attck; 
    }
    
    
    public static void main(String[] args) {
		Hero h = new Hero();
		h.name ="亚瑟";
		h.hp=1000.0f; 
		h.armor = 90.9f;
		h.moveSpeed= 60;
		h.deaths=0;
		h.helps=5;
		h.attckSpeed=18;
		h.killTalk="这是黑化后的亚瑟";
		System.out.println("姓名："+h.name+"\r"+"血量为："+h.hp+"\r"+"护甲："+h.armor+"\r"+"移速："
							+h.moveSpeed+"\r"+"死亡次数："+h.deaths+"\r"+"助攻："+h.helps+"\r"
							+"攻速："+h.attckSpeed+"\r"+"杀人说的话："+h.killTalk	);
		
		
	}
}