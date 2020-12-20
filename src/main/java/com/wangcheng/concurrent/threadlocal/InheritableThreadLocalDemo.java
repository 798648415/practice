package com.wangcheng.concurrent.threadlocal;

/**
 * InheritableThreadLocal的示例代码
 * @author wangcheng
 *
 */
public class InheritableThreadLocalDemo {
	
	//这里的final可以用volatile替换
	private static final InheritableThreadLocal<Integer> intVal = new InheritableThreadLocal<Integer>();
	
	public static void main(String[] args) {
		
		Runnable rP = new Runnable() {
			@Override
			public void run() {
				intVal.set(111);
				Runnable rC = new Runnable() {
					@Override
					public void run() {
						String name = Thread.currentThread().getName();
						System.out.printf("%s %d%n", name, intVal.get());
					}
				};
				Thread tChild = new Thread(rC);
				tChild.setName("child");
				tChild.start();
			}
		};
		Thread tParent = new Thread(rP);
		tParent.setName("parent");
		tParent.start();
	}

}
