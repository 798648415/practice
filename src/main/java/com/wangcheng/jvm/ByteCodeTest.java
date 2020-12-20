package com.wangcheng.jvm;

/**
 * @author WangCheng
 * create in 2020-11-28 1:02
 */
public class ByteCodeTest {
    public static void main(String[] args) {
        Object o = new Object();
    }

    public int add(int i) {
        return ++i;
    }

    public int add2(int i) {
        return i++;
    }
}