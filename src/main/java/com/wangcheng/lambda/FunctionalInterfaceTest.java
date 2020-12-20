package com.wangcheng.lambda;

/**
 * 只要满足FunctionalInterface的条件，即使没有@FunctionalInterface注解，编译器会自动将其作为函数式接口FunctionalInterface
 *
 * @author WangCheng
 * create in 2020-06-23 14:31
 */
@FunctionalInterface
public interface FunctionalInterfaceTest {

    void test();
}
