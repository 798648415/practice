package com.wangcheng.concurrent.lock;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-06-27 22:47
 */
public class LockTest {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {

        } finally {
            lock.unlock();
        }


        //读写锁
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        readWriteLock.readLock();
        readWriteLock.writeLock();
        try {

        } finally {

        }

        //解决ABA问题
        AtomicStampedReference<Object> atomicStampedReference = new AtomicStampedReference<>(new Object(), 0);

    }

}
