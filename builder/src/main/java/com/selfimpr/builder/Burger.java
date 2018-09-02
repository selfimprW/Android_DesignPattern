package com.selfimpr.builder;

/**
 * description： 汉堡包 <br/>
 * ===============================<br/>
 * creator：Jiacheng<br/>
 * create time：2018/9/2 下午3:53<br/>
 * ===============================<br/>
 * reasons for modification：  <br/>
 * Modifier：  <br/>
 * Modify time：  <br/>
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
