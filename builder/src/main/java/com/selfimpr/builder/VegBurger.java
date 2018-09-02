package com.selfimpr.builder;

/**
 * description：  <br/>
 * ===============================<br/>
 * creator：Jiacheng<br/>
 * create time：2018/9/2 下午3:56<br/>
 * ===============================<br/>
 * reasons for modification：  <br/>
 * Modifier：  <br/>
 * Modify time：  <br/>
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
