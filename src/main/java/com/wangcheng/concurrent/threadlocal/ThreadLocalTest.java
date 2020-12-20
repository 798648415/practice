package com.wangcheng.concurrent.threadlocal;

import org.junit.Test;

/**
 * ThreadLocal示例代码
 * @author wangcheng
 *
 */
public class ThreadLocalTest {
	
	//这里的volatile可以用final替换
	private static volatile ThreadLocal<String> userID = new ThreadLocal<>();

	@Test
	public void testThreadLocal() {
		Runnable r = () -> {
			String name = Thread.currentThread().getName();
			userID.set(name.toUpperCase());
			System.out.println(name + " : " + userID.get());
		};
		
		Thread t1 = new Thread(r);
		t1.setName("aaa");
		Thread t2 = new Thread(r);
		t2.setName("bbb");
		t1.start();
		t2.start();
	}
}
