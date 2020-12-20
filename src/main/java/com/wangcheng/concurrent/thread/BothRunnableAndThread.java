package com.wangcheng.concurrent.thread;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019-11-09 23:58
 */
public class BothRunnableAndThread {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable方式");
            }
        }) {
            @Override
            public void run() {
                System.out.println("thread方式");
            }
        }.start();
    }

}
