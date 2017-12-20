package com.dalcourt.jonathan.translator.nouns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.nouns.numbers.CardinalActivity;
import com.dalcourt.jonathan.translator.nouns.numbers.OrdinalActivity;

/**
 * Numbers
 */

public class NumbersActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nouns_numbers);

        // open Cardinal category on click
        TextView cardinal = findViewById(R.id.cardinal_activity);
        cardinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cardinalIntent = new Intent(NumbersActivity.this, CardinalActivity.class);
                startActivity(cardinalIntent);
            }
        });

        // open Ordinal category on click
        TextView ordinal = findViewById(R.id.ordinal_activity);
        ordinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ordinalIntent = new Intent(NumbersActivity.this, OrdinalActivity.class);
                startActivity(ordinalIntent);
            }
        });

    }
}
