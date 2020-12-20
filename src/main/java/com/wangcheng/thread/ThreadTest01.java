package com.wangcheng.thread;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/2/21 21:31
 */
public class ThreadTest01 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("run");

    }

    public static void main(String[] args) {
        //new ThreadTest01().start();
        new ThreadTest01().run();
        System.out.print("main");
    }
}


