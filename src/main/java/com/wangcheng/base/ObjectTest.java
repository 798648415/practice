package com.wangcheng.base;

import org.junit.Test;

/**
 * @author wangcheng
 */
public class ObjectTest implements Cloneable {

    private int count;

    /**
     * 测试Object的clone方法
     */
    @Test
    public void testClone() {
        ObjectTest ot1 = new ObjectTest();
        System.out.println(ot1);
        ot1.count = 5;
        System.out.println(ot1.count);
        //调用clone方法
        Object obj = null;
        try {
            obj = ot1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(obj);
        ObjectTest ot2 = (ObjectTest) obj;
        if (ot2 != null) {
            System.out.println(ot2);
            System.out.println(ot2.count);
        }
    }

}
