package com.wangcheng.concurrent.waitandnotify;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019-11-23 22:39
 */
public class PrintOddOrEvenNumber {

    private static final Object LOCK = new Object();

    private static int i = 0;

    public static void main(String[] args) {
        int max = 101;

        Runnable r = () -> {
            synchronized (LOCK) {
                while (i < max) {
                    System.out.println(i++);
                    LOCK.notify();
                    if (i < max) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);
        thread2.start();
        thread1.start();
    }

}
