package com.wangcheng.concurrent.waitandnotify;

/**
 * 生产者
 * @author wangcheng
 *
 */
public class Provider implements Runnable {
	
	private final Shared shard;
	
	public Provider(Shared shard) {
		this.shard = shard;
	}

	@Override
	public void run() {
		for (char c = 'A'; c <= 'Z'; c++) {
			shard.setCharacter(c);
			System.out.println(c + " produced by provider");
		}
		
	}

}
