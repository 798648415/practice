package com.wangcheng.designpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK实现动态代理
 */
public class ProxyByJDK {

    public static void main(String[] args) {
        //Proxy.newProxyInstance()
    }

}

class MyInvocationHandler implements InvocationHandler {

    /**
     * 目标类
     */
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return result;
    }

}


