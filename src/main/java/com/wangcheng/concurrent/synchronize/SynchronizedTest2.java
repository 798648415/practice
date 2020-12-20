package com.wangcheng.concurrent.synchronize;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019-10-24 21:40
 */
public class SynchronizedTest2 implements Runnable {

    private static SynchronizedTest2 test1 = new SynchronizedTest2();
    private static SynchronizedTest2 test2 = new SynchronizedTest2();

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "获取到对象锁");
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);
        t1.start();
        t2.start();
        /*try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        while (t1.isAlive() || t2.isAlive()) {

        }
        System.out.println("程序结束");
    }
}
