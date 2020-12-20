package com.wangcheng.base;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-06-21 16:21
 */
public class EnumTest {

    public static void main(String[] args) {
        System.out.println(Status.START.getKey());
        System.out.println(Status.STOP);
    }

}

/**
 * 枚举：状态
 *
 * @author WangCheng
 */
enum Status {
    START("a", "100"), RUNNING("b", "101"), STOP();

    public String name;
    private String key;

    private Status() {
        this("default");
    }

    private Status(String name) {
        this.name = name;
    }

    Status(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }
}
