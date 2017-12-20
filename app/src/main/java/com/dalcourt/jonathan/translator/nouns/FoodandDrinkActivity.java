package com.dalcourt.jonathan.translator.nouns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.nouns.fooddrink.DrinkActivity;
import com.dalcourt.jonathan.translator.nouns.fooddrink.FoodActivity;

/**
 * Food
 */

public class FoodandDrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nouns_food_and_drink);

        // Opens Physical Attributes category on click
        TextView food = findViewById(R.id.food_activity);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(
                        FoodandDrinkActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });

        // Opens Physical Attributes category on click
        TextView drink = findViewById(R.id.drink_activity);
        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drinkIntent = new Intent(
                        FoodandDrinkActivity.this, DrinkActivity.class);
                startActivity(drinkIntent);
            }
        });
    }
}
