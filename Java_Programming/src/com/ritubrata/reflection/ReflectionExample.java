package com.ritubrata.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(final String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
	NoSuchMethodException, SecurityException, NoSuchFieldException {
		final TestRelection obj = new TestRelection();
		final Class cls = obj.getClass();
		System.out.println("The name of class is "
				+ cls.getName());
		final Constructor constructor = cls.getConstructor();
		System.out.println("The name of constructor is "
				+ constructor.getName());
		System.out.println(
				"The public methods of class are : ");
		final Method[] methods = cls.getMethods();
		for (final Method method : methods) {
			System.out.println(method.getName());
		}

		final Field field = cls.getDeclaredField("s");
		field.setAccessible(true);
		field.set(obj, "JAVA");

		final Method methodcall1= cls.getDeclaredMethod("method2", int.class);
		methodcall1.invoke(obj, 19);
		final Method methodcall2= cls.getDeclaredMethod("method1");
		methodcall2.invoke(obj);
		final Method methodcall3= cls.getDeclaredMethod("method3");
		methodcall3.setAccessible(true);
		methodcall3.invoke(obj);
	}
}


