package com.wangcheng.concurrent;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-02-26 14:08
 */
public class UncaughtExceptionHandlerTest {

    static class MyUncaughtExceptionHanler implements Thread.UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + "发生异常");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*Runnable r = () -> {
                throw new RuntimeException("子线程异常");
        };

        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHanler());
        new Thread(r).start();*/

        System.out.println(Integer.parseInt("03"));
    }

}
