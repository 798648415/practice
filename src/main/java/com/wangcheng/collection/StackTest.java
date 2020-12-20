package com.wangcheng.collection;

import org.junit.Test;

import java.util.Stack;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/7/21 17:50
 */
public class StackTest {

    @Test
    public void testStack01() {
        Stack<String> stack = new Stack<>();
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }

}
