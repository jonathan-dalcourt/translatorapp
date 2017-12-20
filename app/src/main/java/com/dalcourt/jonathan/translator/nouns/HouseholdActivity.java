package com.dalcourt.jonathan.translator.nouns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.nouns.house.HouseObjectsActivity;
import com.dalcourt.jonathan.translator.nouns.house.HousePlacesActivity;

/**
 * House Terms
 */

public class HouseholdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nouns_house);

        // Opens Objects category on click
        TextView objects = findViewById(R.id.house_activity);
        objects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent objectsIntent = new Intent(HouseholdActivity.this, HouseObjectsActivity.class);
                startActivity(objectsIntent);
            }
        });

        // opens Places category on click
        TextView places = findViewById(R.id.house_places_activity);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placesIntent = new Intent(HouseholdActivity.this, HousePlacesActivity.class);
                startActivity(placesIntent);
            }
        });

    }
}
