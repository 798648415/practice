package com.wangcheng.thread;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-07-05 17:59
 */
public class ThreadPoolTest {

    @Test
    public void test() {
        ExecutorService executorService = Executors.newCachedThreadPool();
    }

    @Test
    public void testForkJoinPool() {
        ExecutorService executorService = Executors.newCachedThreadPool();
    }

}
