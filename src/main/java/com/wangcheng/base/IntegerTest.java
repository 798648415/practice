package com.wangcheng.base;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Cheng
 * @Date 2018/2/28 20:18
 */
public class IntegerTest {

    public static void main(String[] args) {

        //断言为false时报异常，程序也停止运行；冒号后面是false时的提示信息
        //assert 2 > 3 : "error";
        //test01();
        //test02();
        List<String> list = new ArrayList<>();
        int i=0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }

    private static void test02() {
        int a = 1;
        int b = 2;
        System.out.println("交换前 a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后 a = " + a + ", b = " + b);
    }

    public void test01() {
        int num = 100;
        Integer num1 = new Integer(100);
        Integer num2 = new Integer(100);
        System.out.println(num == num1);
        System.out.println(num == num2);
        System.out.println(num1 == num2);//false
        Integer num3 = 100;
        System.out.println(num1 == num3);//false
        System.out.println(num2 == num3);//false
        Integer num4 = 100;
        System.out.println("num3 == num4 " + (num3 == num4));//true
        //-128~127有缓存
        Integer num5 = 128;
        Integer num6 = 128;
        System.out.println("num5 == num6 " + (num5 == num6));//false
        Integer num7 = Integer.valueOf(100);
        System.out.println(num2 == num7);//false
        System.out.println(num4 == num7);//true
        Integer num8 = Integer.valueOf(100);
        System.out.println(num4 == num8);//true
    }


}
