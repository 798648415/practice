package com.wangcheng.base;

/**
 * @Author Wang Cheng
 * @Date 2018/2/27 18:11
 */
public class FinallyTest {

    public static void main(StringTest[] args) {
        int i = testFinally();
        System.out.println("main >>>" +  i);
        System.out.println(new FinallyTest());
    }

    public static int testFinally() {
        int i = 0;
        try {
            return ++i;
        } catch (Exception e) {

        } finally {
            i += 2;
            System.out.println("testFinally >>>" + i);
        }
        System.out.println("====");
        return i;
    }


}
