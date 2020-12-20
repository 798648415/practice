package com.wangcheng.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * 关键字volatile
 */
public class VolatileTest {

    private static boolean flag;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!flag) {
                    i++;
                    System.out.println(i);
                }
            }
        }).start();
        //主线程睡眠2秒
        TimeUnit.SECONDS.sleep(2);
        flag = true;
    }

}
