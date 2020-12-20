package com.wangcheng.concurrent.synchronize;

/**
 * description:
 * synchronized方法无论正常执行完还是抛出异常后都会自动释放锁
 * Lock需要手动释放锁，而且抛出异常后也不会自动释放锁
 *
 * @author WangCheng
 * create in 2019-10-24 21:40
 */
public class SynchronizedTest4 implements Runnable {

    private static SynchronizedTest4 instance = new SynchronizedTest4();

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
        System.out.println(Thread.currentThread().getName() + "获取到对象锁");
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("test");
        //System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    private synchronized void method2() {
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
