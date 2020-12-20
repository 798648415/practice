package com.wangcheng.base;

/**
 * final关键字
 * 1.final修饰类：被final修饰的类不能作为父类被其他类继承
 * 2.final修饰方法：被final修饰的方法不能被重写
 * 3.final修饰成员变量：初始化后值不能被修改，如果是引用类型，引用不能修改，但是对象的属性值是可以修改的
 */
public final class FinalTest {

    private final int n;

    public FinalTest() {
        this.n = 5;
    }
}
