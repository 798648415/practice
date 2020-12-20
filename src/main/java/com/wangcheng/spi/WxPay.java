package com.wangcheng.spi;

/**
 * description: 这里为了省事，实际上接口和实现类不在一个项目中，需要导入接口依赖
 *
 * @author WangCheng
 * create in 2020-08-12 17:17
 */
public class WxPay implements PayService {
    @Override
    public void pay() {
        System.out.println("微信支付完成");
    }
}
