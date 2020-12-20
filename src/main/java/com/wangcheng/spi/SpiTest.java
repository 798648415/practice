package com.wangcheng.spi;

import java.util.ServiceLoader;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-08-12 17:26
 */
public class SpiTest {

    public static void main(String[] args) {
        ServiceLoader<PayService> loader = ServiceLoader.load(PayService.class);
        for (PayService payService : loader) {
            System.out.println(payService);
            payService.pay();
        }
    }

}
