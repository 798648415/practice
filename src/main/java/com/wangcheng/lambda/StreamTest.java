package com.wangcheng.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-06-23 15:11
 */
public class StreamTest {

    @Test
    public void testArray() {
        int[] arr = new int[]{1, 2, 3};

        long count = Arrays.stream(arr).filter(i -> i > 1).count();
        System.out.println(count);
    }

    @Test
    public void testList() {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        list.forEach(System.out::println);
        long count = list.stream().filter(s -> s.length() > 4).count();

        System.out.println(count);
    }

}
