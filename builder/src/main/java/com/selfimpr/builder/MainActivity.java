package com.selfimpr.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * description： 建造者模式 http://www.runoob.com/design-pattern/builder-pattern.html  <br/>
 * ===============================<br/>
 * creator：Jiacheng<br/>
 * create time：2018/8/26 上午12:46<br/>
 * ===============================<br/>
 * reasons for modification：  <br/>
 * Modifier：  <br/>
 * Modify time：  <br/>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MealBuilder vegBuilder = new MealBuilder();
        Meal vegMeal = vegBuilder.addItem(new VegBurger())
                .addItem(new Coke())
                .build();

        Log.e("builder", "Veg Meal:");
        vegMeal.showItems();
        Log.e("builder", "Total Cost: " + vegMeal.getCost());

        MealBuilder chickenBuilder = new MealBuilder();
        Meal chickenMeal = chickenBuilder.addItem(new ChickenBurger())
                .addItem(new Pepsi())
                .build();
        Log.e("builder", "chickenMeal:");
        chickenMeal.showItems();
        Log.e("builder", "Total Cost: " + chickenMeal.getCost());
    }
}
