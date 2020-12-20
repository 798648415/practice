package com.wangcheng.lambda;

import org.junit.Test;

/**
 * description: 无参lambda形式
 *
 * @author WangCheng
 * create in 2020-06-23 14:10
 */
public class NoParameterLambdaTest {

    @Test
    public void test() {
        //传统方式
        Runnable r1 = () -> System.out.println("run...");
        new Thread(r1).start();

        Runnable r2 = () -> System.out.println("hello lambda");
        new Thread(r2).start();

        new Thread(() -> System.out.println("hello lambda!!!")).start();

        //无返回值，且只有一条语句时可以省略大括号{}
        new Thread(() ->
                System.out.println("hello lambda!!!!!!")
        ).start();
    }

}
