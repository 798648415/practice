package com.wangcheng.reflect;

import java.lang.reflect.Field;
import java.util.stream.Stream;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-06-22 20:55
 */
public class FieldTest {

    public static void main(String[] args) {
        A a = new A();
        //B b = new B();
        //System.out.println(b);
        Class<? extends A> clazz = a.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Stream.of(fields).forEach(field -> {
            if (field.isAnnotationPresent(Autowired.class)) {
                //允许访问私有属性
                field.setAccessible(true);
                Class<?> fieldType = field.getType();
                System.out.println(fieldType);
                try {
                    Object object = fieldType.newInstance();
                    field.set(a, object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println(a.getB());
    }

}

class A {

    @Autowired
    private B b;

    public B getB() {
        return b;
    }
}

class B {
}
