package com.wangcheng.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019-10-19 21:15
 */
public class HashMapTest {

    @Test
    public void test01() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "test");
        map.put("2", "test");
        map.put(null, "test");
        System.out.println(map);
    }

}
