package com.wangcheng.concurrent.thread;

/**
 * description:
 * 不能调用两次start()方法，会抛出议程
 * threadStatus初始值为0
 * if (threadStatus != 0)
 *             throw new IllegalThreadStateException();
 *
 * @author WangCheng
 * create in 2019-11-10 21:50
 */
public class StartTwiceThread {

    public static void main(String[] args) {
        Thread thread = new Thread();
        //第一次调用后线程threadStatus会变化
        thread.start();
        //第二次在调用threadStatus != 0
        thread.start();
    }

}
