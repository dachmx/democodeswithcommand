package com.dachmx.codes.proxyjava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
	private Object proxied;

	public ProxyHandler(Object proxied){
		this.proxied = proxied;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		return method.invoke(proxied, args);

	}
}
