package com.selfimpr.facade;

import android.util.Log;

/**
 * description：   <br/>
 * ===============================<br/>
 * creator：Jiacheng<br/>
 * create time：2018/8/26 上午12:46<br/>
 * ===============================<br/>
 * reasons for modification：  <br/>
 * Modifier：  <br/>
 * Modify time：  <br/>
 */
public class Memory implements IOperate {
    @Override
    public void startup() {
        Log.e("facade", "Memory startup!");
    }

    @Override
    public void shutdown() {

        Log.e("facade", "Memory startup!");
    }
}
