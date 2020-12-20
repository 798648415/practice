package com.wangcheng.nio;

import org.junit.Test;

import java.nio.ByteOrder;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/3/6 17:03
 */
public class ByteOrderTest {

    @Test
    public void test01() {
        //查看当前是大端还是小端
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        System.out.println(byteOrder);
    }

}
