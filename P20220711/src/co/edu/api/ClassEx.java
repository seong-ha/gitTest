package co.edu.api;

import java.lang.reflect.Method;

public class ClassEx {

	public static void main(String[] args) {

		try {
			Class cls = Class.forName("java.lang.String");
			cls = String.class;
			System.out.println(cls.getName());
			System.out.println("====================");

			Method[] methods = cls.getMethods();
			for (Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
