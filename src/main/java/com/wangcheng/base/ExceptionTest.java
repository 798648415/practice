package com.wangcheng.base;

/**
 * @author wangcheng
 */
public class ExceptionTest {

    public static void main(StringTest[] args) {
        testException1();

        try {
            testException2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            testException3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testException1() {
        try {
            throw new Exception("test1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testException2() throws Exception {
        throw new Exception("test1");
    }

    public static void testException3() throws Exception {

    }

    public static void testException4() {
        //throw new Exception("test1");
    }

}
