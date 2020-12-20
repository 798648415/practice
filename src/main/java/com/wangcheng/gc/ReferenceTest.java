package com.wangcheng.gc;

import org.junit.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * description:强、软、弱、虚引用(引用强度依次逐渐减弱)
 *
 * @author WangCheng
 * create in 2019/3/10 20:07
 */
public class ReferenceTest {

    @Test
    public void testSoftReference() {
        SoftReference<String> softReference = new SoftReference<>("SoftReference");
        System.out.println(softReference.get());
    }

    @Test
    public void testWeakReference() {
        WeakReference<String> weakReference = new WeakReference<>("WeakReference");
        System.out.println(weakReference.get());
    }

    @Test
    public void testPhantomReference() {
        final ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        //PhantomReference的get方法总是返回null，
        // 其意义在于说明一个对象已经进入finalization阶段，可以被gc回收，用来实现比finalization机制更灵活的回收操作。
        PhantomReference<String> phantomReference = new PhantomReference<>("PhantomReference", referenceQueue);
        System.out.println(phantomReference.get());
    }


}
