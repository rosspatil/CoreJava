package com.refletion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo {
	public static void main(String[] args) {

		Class reflectClass=Calci.class;
		
		System.out.println("name:"+reflectClass.getName());
		
		int modifier=reflectClass.getModifiers();
		System.out.println(Modifier.toString(modifier));
		
		Class[] interfaces=reflectClass.getInterfaces();
		for (Class class1 : interfaces) {
			System.out.println(class1.getInterfaces());
		}
		
		Method[] methods=reflectClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());		
			System.out.println(method.getReturnType());
			
			Class[] parameter=method.getParameterTypes();
			for (Class class1 : parameter) {
				System.out.println(class1.getName());
			}
			
			
		}
		System.out.println(reflectClass.getPackage());
		
		Field[] fields=reflectClass.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		Constructor[] constructor=reflectClass.getConstructors();
		for (Constructor constructor2 : constructor) {
			System.out.println(constructor2.getName());
		}
		
		
	}
}
