package com.wangcheng.jvm;

import org.junit.Test;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/3/8 23:14
 */
public class RuntimeTest {

    @Test
    public void test01() {
        Runtime runtime = Runtime.getRuntime();
        //剩余空间的字节数
        long freeMemory = runtime.freeMemory();
        System.out.println(freeMemory);
        //总内存的字节数
        long totalMemory = runtime.totalMemory();
        System.out.println(totalMemory);
        //最大内存的字节数
        long maxMemory = runtime.maxMemory();
        System.out.println(maxMemory);

        String property = System.getProperty("sun.arch.data.model");
        System.out.println(property);

        runtime.gc();
    }

}
