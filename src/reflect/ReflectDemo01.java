package reflect;

import java.lang.reflect.Method;

//通过反射获取类
public class ReflectDemo01 {
	 public static void Demo01() {
		/*
		 * 获取反射对象的三种方法
		 */
			//1.class.forName
		try {
			Class<?> perClazz01 = Class.forName("reflect.Person");
			System.out.println(perClazz01);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//2.类名.class
		   Class<?> perClazz02 = Person.class;
		   System.out.println(perClazz02);	
		    //3.getClass();
		   //new person 对象
		   Person person = new Person();
		   Class<?> perClazz03 = person.getClass();
		   System.out.println(perClazz03);
	 }


	 //获取接口
	 private static void Demo03() {
		 Class<?> perClazz = null;
		 try {
		 perClazz =	Class.forName("reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //获取所有接口
		Class<?>[] Interfaces = perClazz.getInterfaces();
		 for(Class<?> inter:Interfaces) {//遍历取关键字
			 System.out.println(inter);
		 }
	 }
	 
	 
	
	 //获取方法	  
	   private static void Demo02() {
		   Class<?> perClazz = null;
		   try {
	        perClazz = Class.forName("reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   //获取所有的公共方法
		   Method[] methods = perClazz.getMethods();
		   for(Method method:methods) {
			   System.out.println(method);
		   }
	   }
	   public static void main(String[] args) {
		   //Demo01();
			//Demo02();
		   Demo03();
	   }

}
