package com.wangcheng.base;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/3/7 11:51
 */
public class ShortTest {

    public static void main(StringTest[] args) {
        test01();
    }

    private static void test01() {
        short num = 1;
        //num = num + 5;编译报错
        num += 5;
        System.out.println(num);
    }

}
