package com.wangcheng.collection;

import org.junit.Test;

import java.util.PriorityQueue;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/3/8 15:52
 */
public class PriorityQueueTest {

    @Test
    public void test01() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(4);
        System.out.println(priorityQueue);
    }

}
