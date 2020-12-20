package com.wangcheng.base;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/3/5 13:25
 */
public class DoubleTest {

    private static void test01() {
        double d1 = 1.1;
        long l = Double.doubleToLongBits(d1);
        System.out.println(l);
    }

    private static void test02() {
        System.out.println(3 * 0.1 == 0.3);
    }

    public static void main(StringTest[] args) {
        //test01();
        test02();
    }


}
