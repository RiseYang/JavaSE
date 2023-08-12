package reflect;

import java.lang.reflect.Method;

//ͨ�������ȡ��
public class ReflectDemo01 {
	 public static void Demo01() {
		/*
		 * ��ȡ�����������ַ���
		 */
			//1.class.forName
		try {
			Class<?> perClazz01 = Class.forName("reflect.Person");
			System.out.println(perClazz01);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//2.����.class
		   Class<?> perClazz02 = Person.class;
		   System.out.println(perClazz02);	
		    //3.getClass();
		   //new person ����
		   Person person = new Person();
		   Class<?> perClazz03 = person.getClass();
		   System.out.println(perClazz03);
	 }


	 //��ȡ�ӿ�
	 private static void Demo03() {
		 Class<?> perClazz = null;
		 try {
		 perClazz =	Class.forName("reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //��ȡ���нӿ�
		Class<?>[] Interfaces = perClazz.getInterfaces();
		 for(Class<?> inter:Interfaces) {//����ȡ�ؼ���
			 System.out.println(inter);
		 }
	 }
	 
	 
	
	 //��ȡ����	  
	   private static void Demo02() {
		   Class<?> perClazz = null;
		   try {
	        perClazz = Class.forName("reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   //��ȡ���еĹ�������
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
