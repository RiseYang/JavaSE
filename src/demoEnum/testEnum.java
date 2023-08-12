package demoEnum;


public class testEnum {
	public static void main(String[] args) {
		System.out.println(Season.AUTUMN);
	}
static class Season {
	private String name;
	private String desc;
	
	public Season(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setDesc(String desc) {
//		this.desc = desc;
//	}
	public final static Season SPRING = new Season("spring","温暖" );
	public final static Season SUMMER = new Season("summer","闷热" );
	public final static Season AUTUMN = new Season("autumn","凉爽" );
	public final static Season WINTER = new Season("winter","寒冷" );

	@Override
	public String toString() {
		return "Season [name=" + name + ", desc=" + desc + "]";
	}
	
	
}
	

}
