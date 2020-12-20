package com.wangcheng.collection;

import org.junit.Test;

import java.util.Hashtable;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/3/7 18:37
 */
public class HashtableTest {

    @Test
    public void test01() {
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("1", new Object());
        hashtable.put("2", new Object());
        //hashtable的key不能为null
        /*hashtable.put(null, new Object());*/
        System.out.println(hashtable);
    }

}
