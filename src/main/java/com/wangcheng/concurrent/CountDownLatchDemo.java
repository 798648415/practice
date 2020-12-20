package com.wangcheng.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
	
	public static void main(String[] args) {
		testCountDownLatch1();
	}
	
	/**
	 * 让4个线程停在某处然后再同时往下执行
	 */
	public static void testCountDownLatch1() {
		int nthreads = 4;
		final CountDownLatch latch = new CountDownLatch(nthreads);
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name + " A方法");
				latch.countDown();
				System.out.println(name + " " + latch.getCount());
				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(System.currentTimeMillis());
				System.out.println(name + " B方法");
				System.out.println(name + " C方法");
				System.out.println(name + " D方法");
			}
		};
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name + " A方法");
				latch.countDown();
				System.out.println(name + " " + latch.getCount());
				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(System.currentTimeMillis());
				System.out.println(name + " B方法");
				System.out.println(name + " C方法");
			}
		};
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name + " A方法");
				latch.countDown();
				System.out.println(name + " " + latch.getCount());
				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(System.currentTimeMillis());
				System.out.println(name + " B方法");
			}
		};
		Runnable r4 = new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name + " A方法");
				latch.countDown();
				System.out.println(name + " " + latch.getCount());
				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(System.currentTimeMillis());
			}
		};
		//启动4个线程
		ExecutorService executor = Executors.newFixedThreadPool(4);
		executor.submit(r1);
		executor.submit(r2);
		executor.submit(r3);
		executor.submit(r4);
		executor.shutdown();
	}

}
