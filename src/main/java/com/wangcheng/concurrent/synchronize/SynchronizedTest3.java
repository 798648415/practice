package com.wangcheng.concurrent.synchronize;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019-10-24 21:40
 */
public class SynchronizedTest3 implements Runnable {

    private static SynchronizedTest3 instance = new SynchronizedTest3();

    @Override
    public void run() {
        //Thread-0是默认的第1条线程名称，以此类推：Thread-1表示第2条线程名称
        if ("Thread-0".equals(Thread.currentThread().getName())) {
            this.method1();
        } else {
            this.method2();
        }
    }

    private synchronized void method1() {
        System.out.println("我是加锁的方法");
        System.out.println(Thread.currentThread().getName() + "获取到对象锁");
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    private void method2() {
        System.out.println("我是没有加锁的方法");
        System.out.println(Thread.currentThread().getName() + "获取到对象锁");
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
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
