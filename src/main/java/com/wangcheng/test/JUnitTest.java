package com.wangcheng.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * description:
 *
 * @author WangCheng
 * create in 2019/3/8 22:39
 */
public class JUnitTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test01() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("提示信息");
    }

}
