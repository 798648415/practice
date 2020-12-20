package com.wangcheng.base;

public class BreakTest {
	
	public static void testBreak1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("j = " + j);
				if (j == 3) {
					break;
				}
			}
			if (i == 3) {
				break;
			}
		}
	}
	
	public static void main(StringTest[] args) {
		testBreak1();
	}

}
