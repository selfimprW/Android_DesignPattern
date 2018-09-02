package com.selfimpr.builder;

/**
 * description： 食物条目的接口 <br/>
 * ===============================<br/>
 * creator：Jiacheng<br/>
 * create time：2018/9/2 下午3:49<br/>
 * ===============================<br/>
 * reasons for modification：  <br/>
 * Modifier：  <br/>
 * Modify time：  <br/>
 */
public interface Item {
   String name();

   Packing packing();

   float price();
}
