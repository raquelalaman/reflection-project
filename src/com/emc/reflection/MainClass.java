package com.emc.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException, 
	NoSuchMethodException, SecurityException, 
	IllegalArgumentException, InvocationTargetException {
		Class<?> helloWorldClass = Class
				.forName("com.emc.reflection.HelloWorld");
		System.out.println(helloWorldClass);
		Object helloWorld = helloWorldClass.newInstance();
		
		Class<?> noparams[] = {};
		Method methodSayHello = helloWorldClass.getDeclaredMethod("sayHello", noparams);
		methodSayHello.invoke(helloWorld, (Object[])null);
		
		Method methodSayHelloWithParam = helloWorldClass.getDeclaredMethod("sayHello", String.class);
		methodSayHelloWithParam.invoke(helloWorld, new String("Raquel"));
	}
}
