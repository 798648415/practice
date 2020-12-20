package com.wangcheng.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author WangCheng
 * create in 2020-10-27 10:28
 */
public class CallableTest implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "结果";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest callableTest = new CallableTest();
        FutureTask<String> futureTask = new FutureTask<>(callableTest);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
