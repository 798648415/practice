package com.wangcheng.base;

import java.lang.reflect.Constructor;

/**
 * 反射
 */
public class ReflectTest {

    public ReflectTest() {
        System.out.println("执行构造器");
    }

    public static void main(StringTest[] args) throws Exception {
        //利用Class对象创建对象
        Class<ReflectTest> clazz = ReflectTest.class;
        ReflectTest rt1 = clazz.newInstance();
        System.out.println(rt1);
        //利用Constructor创建对象
        Constructor<ReflectTest> constructor = clazz.getConstructor();
        ReflectTest rt2 = constructor.newInstance();
        System.out.println(rt2);


    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}
