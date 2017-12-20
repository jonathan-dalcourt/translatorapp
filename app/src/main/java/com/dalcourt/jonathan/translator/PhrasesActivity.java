package com.dalcourt.jonathan.translator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.phrases.AboutActivity;
import com.dalcourt.jonathan.translator.phrases.DescriptiveActivity;
import com.dalcourt.jonathan.translator.phrases.LocationActivity;
import com.dalcourt.jonathan.translator.phrases.TimeActivity;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrases);

        // open About Someone category on click
        TextView about = findViewById(R.id.about_someone_activity);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(PhrasesActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });

        // open Describe Yourself category on click
        TextView descriptive = findViewById(R.id.descriptive_activity);
        descriptive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent descriptiveIntent = new Intent(PhrasesActivity.this, DescriptiveActivity.class);
                startActivity(descriptiveIntent);
            }
        });

        // open Places category on click
        TextView places = findViewById(R.id.location_activity);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placesIntent = new Intent(PhrasesActivity.this, LocationActivity.class);
                startActivity(placesIntent);
            }
        });

        // open Time category on click
        TextView time = findViewById(R.id.time__activity);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent timeIntent = new Intent(PhrasesActivity.this, TimeActivity.class);
                startActivity(timeIntent);
            }
        });
    }
}