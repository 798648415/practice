package com.wangcheng.concurrent.synchronize;

/**
 * description:
 * 可重入特性测试
 *
 * @author WangCheng
 * create in 2019-10-24 21:40
 */
public class SynchronizedTest5 extends Parent {


    @Override
    public synchronized void method1() {
        System.out.println("我是子类方法");
        super.method1();
    }

    public static void main(String[] args) {
        SynchronizedTest5 instance = new SynchronizedTest5();
        instance.method1();
    }

}

class Parent {
    public synchronized void method1() {
        System.out.println("我是父类方法");
    }
}
