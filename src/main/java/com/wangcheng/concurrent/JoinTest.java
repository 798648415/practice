package com.wangcheng.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-02-13 21:20
 */
public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            System.out.println("子线程运行中...");
        };

        Thread thread = new Thread(r);
        thread.start();
        //thread.join();

        //thread.join()替代代码
        synchronized (thread) {
            thread.wait();
        }

        System.out.println("所有子线程执行完毕");
    }

}
