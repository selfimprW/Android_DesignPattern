package com.selfimpr.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * description：   <br/>
 * ===============================<br/>
 * creator：Jiacheng<br/>
 * create time：2018/9/2 下午4:03<br/>
 * ===============================<br/>
 * reasons for modification：  <br/>
 * Modifier：  <br/>
 * Modify time：  <br/>
 */
public class MealBuilder {
    private List<Item> items = new ArrayList<>();

    public MealBuilder addItem(Item item) {
        items.add(item);
        return this;
    }

    public Meal build() {
        Meal meal = new Meal();
        meal.setItems(items);
        return meal;
    }
}
