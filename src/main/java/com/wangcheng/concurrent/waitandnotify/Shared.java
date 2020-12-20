package com.wangcheng.concurrent.waitandnotify;

public class Shared {
	
	private char ch;
	private volatile boolean writable = true;
	
	public void setCharacter(char c) {
		synchronized(this) {
			while (!writable) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.ch = c;
			this.writable = false;
			this.notify();
		}
	}
	
	public char getCharacter() {
		synchronized(this) {
			while (writable) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.writable = true;
			this.notify();
			return ch;
		}
	}
	
	public static void main(String[] args) {
		Shared s = new Shared();
		Provider provider = new Provider(s);
		Consumer consumer = new Consumer(s);
		
		new Thread(provider).start();
		new Thread(consumer).start();
		
	}

}
