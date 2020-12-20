package com.wangcheng.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * description: 有参lambda形式
 *
 * @author WangCheng
 * create in 2020-06-23 14:10
 */
public class MultiParameterLambdaTest {

    @Test
    public void test() {
        //传统方式
        Comparator<String> comparator1 = Comparator.comparingInt(String::length);
        TreeSet<String> treeSet1 = new TreeSet<>(comparator1);


        Comparator<String> comparator2 = Comparator.comparingInt(String::length);
        TreeSet<String> treeSet2 = new TreeSet<>(comparator2);


        TreeSet<String> treeSet3 = new TreeSet<>(Comparator.comparingInt(String::length));

        //有返回值，但执行语句只有一句，可以省略大括号{}和return
        TreeSet<String> treeSet4 = new TreeSet<>(Comparator.comparingInt(String::length));
    }

}
