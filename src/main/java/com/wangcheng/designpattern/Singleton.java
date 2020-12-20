package com.wangcheng.designpattern;


import java.util.Timer;

/**
 * 同步的饿汉式单例模式
 * @author wangcheng
 *
 */
public class Singleton {
	
	private static volatile Singleton instance;
	
	private Singleton() {}

	/**
	 * 第一种线程安全的单例（双重检测）
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized(Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	private static class Holder {
		private static final Singleton INSTANCE = new Singleton();
	}

	/**
	 * 第二种线程安全的单例(延迟加载)
	 */
	public static Singleton getInstance2() {
		return Holder.INSTANCE;
	}

	static Runnable r = () -> {
		System.out.println(Singleton.getInstance());
		//System.out.println(Singleton.getInstance2());
	};

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(r).start();
		}
	}
	

}
