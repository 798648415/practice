package com.wangcheng.base;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 * @author wangcheng
 */
public class GenericTest {

    @Test
    public static void testGeneric1() {
        List list1 = new ArrayList();
        list1.add(null);
        list1.add(null);
        list1.add(new String("aaa"));
        list1.add(1);

        List<Object> list2 = new ArrayList<>();
        list2.add(null);
        list2.add(new String("aaa"));
        list2.add(1);

        List<?> list3 = new ArrayList<>();
        list3.add(null);
        //list3.add(new StringTest("aaa"));
        //  list3.add(new StringTest("bbb"));
    }

}
