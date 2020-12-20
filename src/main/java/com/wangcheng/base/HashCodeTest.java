package com.wangcheng.base;

public class HashCodeTest {

    public static void main(StringTest[] args) {
        String s = new String("ab");
        System.out.println(s);
        System.out.println(s.hashCode());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
