package com.selfimpr.builder;

import android.util.Log;

import java.util.List;

/**
 * description：   <br/>
 * ===============================<br/>
 * creator：Jiacheng<br/>
 * create time：2018/9/2 下午4:00<br/>
 * ===============================<br/>
 * reasons for modification：  <br/>
 * Modifier：  <br/>
 * Modify time：  <br/>
 */
public class Meal {
    private List<Item> items;

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            Log.e("builder", "Item:" + item.name());
            Log.e("builder", "Packing:" + item.packing().pack());
            Log.e("builder", "Price:" + item.price());
        }
    }
}
