package com.selfimpr.facade;

import android.util.Log;

/**
 * description：   <br/>
 * ===============================<br/>
 * creator：Jiacheng<br/>
 * create time：2018/8/26 上午12:45<br/>
 * ===============================<br/>
 * reasons for modification：  <br/>
 * Modifier：  <br/>
 * Modify time：  <br/>
 */
public class CPU implements IOperate {
    @Override
    public void startup() {
        Log.e("facade", "CPU startup!");
    }

    @Override
    public void shutdown() {
        Log.e("facade", "CPU shutdown!");
    }
}
