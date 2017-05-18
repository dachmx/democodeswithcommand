package com.dachmx.codes.proxyjava;

import java.lang.reflect.InvocationHandler;   
import java.lang.reflect.Method;   
import java.lang.reflect.Proxy;   
import sun.misc.ProxyGenerator;   
import java.io.*; 

public class ProxyJava{
	public static void main(String[] args){
		System.out.println("Hello, This is Proxyjava test!...");
		SubjectImpl subject = new SubjectImpl();
		Subject proxySubject = (Subject)Proxy.newProxyInstance(Subject.class.getClassLoader(),
				new Class[]{
					Subject.class
				}, new ProxyHandler(subject));
		proxySubject.doSomething();

	}

}
