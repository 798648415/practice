package com.wangcheng.concurrent.waitandnotify;

/**
 * 消费者
 * @author wangcheng
 *
 */
public class Consumer implements Runnable {
	
	private final Shared shard;
	
	public Consumer(Shared shard) {
		this.shard = shard;
	}

	@Override
	public void run() {
		char c;
		do {
			c = shard.getCharacter();
			System.out.println(c + " consumed by Consumer");
		} while (c != 'Z');
	}
	
}
