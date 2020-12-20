package com.wangcheng.base;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/3/5 10:30
 */
public class ByteTest {

    public static void main(StringTest[] args) {
        test01();
    }

    private static void test01() {
        byte b1 = 1, b2 = 2;
        //两个byte类型变量算术运算结果会自动转换成int类型
        int b3 = b1 + b2;
        System.out.println("b3 =" + b3);
        byte b4 = 126 + 1;
        System.out.println("b4 =" + b4);

        short s1 = 1;
        s1 += 1;
        System.out.println("s1 = " + s1);
    }

}
