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
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup() {
        Log.e("facade", "start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        Log.e("facade", "start computer finished!");

    }

    public void shutdown() {
        Log.e("facade", "begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        Log.e("facade", "computer closed!");
    }
}
