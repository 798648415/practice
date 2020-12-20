package com.wangcheng.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/3/6 16:48
 */
public class ByteBufferTest {

    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        //ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        // 创建12个字节的字节缓冲区
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[12]);
        // 存入字符串
        byteBuffer.asCharBuffer().put("abdcef");
        System.out.println(Arrays.toString(byteBuffer.array()));

        // 反转缓冲区
        byteBuffer.rewind();
        // 设置字节存储次序
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(byteBuffer.array()));

        // 反转缓冲区
        byteBuffer.rewind();
        // 设置字节存储次序
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(byteBuffer.array()));
    }

}
