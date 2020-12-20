package com.wangcheng.base;

/**
 * 运算符
 */
public class OperatorTest {

    public static void main(StringTest[] args) {
        testBitwiseOperators();
    }

    /**
     * 位运算符
     */
    public static void testBitwiseOperators() {
        int m = -2;
        //左移2位
        System.out.println(m << 2);
        //右移1位
        System.out.println(m >> 1);
        //无符号右移，忽略符号位，空位都以0补齐(没有<<<)
        System.out.println(m >>> 1);

    }

}
