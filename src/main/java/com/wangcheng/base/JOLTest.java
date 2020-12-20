package com.wangcheng.base;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import java.util.concurrent.TimeUnit;

/**
 * description:
 * -XX:BiasedLockingStartupDelay=0 设置偏向锁延时时间，默认延时是4秒
 *
 * @author WangCheng
 * create in 2020-06-30 20:43
 */
public class JOLTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(VM.current().details());

        //System.out.println(ClassLayout.parseClass(Object.class).toPrintable());

        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        TimeUnit.SECONDS.sleep(5);
        synchronized (o) {
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }

        /*Son son = new Son();
        System.out.println(ClassLayout.parseInstance(son).toPrintable());

        Person person = new Person();
        System.out.println(ClassLayout.parseInstance(person).toPrintable());*/
    }

}

class Person {
    char c;
    String str = "test";
    Son son = new Son();
}

class Son{

}
