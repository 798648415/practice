package com.wangcheng.base;

import org.junit.Test;

/**
 * description:
 * JDK1.6及以前，调用String.intern()，如果常量池中没有，则拷贝一份对象，放到常量池中。
 * JDK1.7及以后，调用String.intern()，如果常量池中没有，则拷贝一份引用，放到常量池中。
 *
 * @author WangCheng
 * create in 2019/3/7 19:00
 */
public class StringTest {

    public StringTest() {
        super();
    }

    @Test
    public void test01() {
        String s1 = "abc";
        final String s2 = "a";
        final String s3 = "bc";
        String s4 = s2 + s3;
        //true 因为final变量在编译后会直接替换成对应的值，所以实际上等于s4=”a”+”bc”，而这种情况下，编译器会直接合并为s4=”abc”，所以最终s1==s4
        System.out.println(s1 == s4);
    }

    @Test
    public void test02() {
        String s1 = "abc";
        String s2 = "a";
        String s3 = "bc";
        String s4 = s2 + s3;
        //false 因为s2+s3实际上是使用StringBuilder.append来完成，会生成不同的对象
        System.out.println(s1 == s4);
    }

    @Test
    public void test03() {
        String s = new String("abc");
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s == s1.intern());
        System.out.println(s == s2.intern());
        System.out.println(s1 == s2.intern());

        String s5 = new String("Hello"); //先在常量池中创建，再在堆中创建，返回的数值s5是堆中的地址
        String s6 = s5.intern();         //返回的数值s6 ，是常量池中的地址
        String s7 = "Hello";            //返回的数值s10，是常量池中的地址
        System.out.println(s5 == s6);   //输出false

        System.out.println(s6 == s7);  //输出true

    }

}
