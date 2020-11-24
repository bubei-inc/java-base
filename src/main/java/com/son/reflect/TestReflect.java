package com.son.reflect;

public class TestReflect {
    public static void main(String[] args) {
        // 定义字符串模拟支付方式
        String str = "zfb";
        if ("zfb".equals(str)) { // 避免空指针异常, 2. 多态虽然可以提高扩展性，但是上面的分支还是需要手动操作，没有实现完全的自动化
            // 支付宝支付
            new Alipay().payOnline();
        }else {
            // 微信支付
            new Wechat().payOnline();

        }
    }

    // 重载, if 这种方式缺点是 方法的扩展性不是很高， 多态
//    public static void pay(Wechat c) {
//        c.payOnline();
//    }
//
//    public static void pay(Alipay a) {
//        a.payOnline();
//    }

    public static void pay(MTout mt) {
        mt.payOnline();
    }

}

