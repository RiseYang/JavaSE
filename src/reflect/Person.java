package reflect;

public class Person implements MyInterface,MyInterface2 {
	private int id;
	private String name;
	private int age;
	
	//无参构造
	public Person() {
		
	}
	
	public Person(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	private void privateMethod() {
		System.out.println("private method.....");
	}
	
	public static void staticMethod() {
		System.out.println("this is staticMethod method....");
	}

	@Override
	public void InterfaceMethods() {
		// TODO Auto-generated method stub
		System.out.println("interface method......");
	}

	@Override
	public void Interface2Methods() {
		// TODO Auto-generated method stub
		System.out.println("interface2 menthod.....");
	}
}
