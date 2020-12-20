package com.wangcheng.concurrent.thread;

import java.util.concurrent.*;

/**
 * 本质就是一种，最终都要创建Thread对象
 * 实现多线程的4种编码方式
 * 1.继承Thread类创建线程
 * 2.实现Runnable接口创建线程
 * 3.实现Callable接口通过FutureTask包装器来创建Thread线程
 * 4.使用ExecutorService、Callable、Future实现有返回结果的线程
 *
 * @author wangcheng
 */
public class Multithreads {

    public static void main(String[] args) {
        //继承Thread类创建线程
        new MyThread().start();
        //实现Runnable接口创建线程
        new Thread(new MyRunnable()).start();
        //实现Callable接口通过FutureTask包装器来创建Thread线程
        MyCallable<String> mc1 = new MyCallable<String>("实现Callable接口通过FutureTask包装器来创建Thread线程");
        FutureTask task = new FutureTask(mc1);
        new Thread(task).start();
        //使用ExecutorService、Callable、Future实现有返回结果的线程
        MyCallable<String> mc2 = new MyCallable<String>("使用ExecutorService、Callable、Future实现有返回结果的线程");
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> result = service.submit(mc2);
        service.shutdown();
    }

}


class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("继承Thread类创建线程");
    }

}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口创建线程");
    }
}

class MyCallable<String> implements Callable<String> {

    private String hint;

    public MyCallable(String hint) {
        this.hint = hint;
    }

    @Override
    public String call() throws Exception {
        System.out.println(hint);
        return hint;
    }
}
