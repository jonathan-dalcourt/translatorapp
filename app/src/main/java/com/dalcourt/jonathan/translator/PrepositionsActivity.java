package com.dalcourt.jonathan.translator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.prepositions.ChronologicalActivity;
import com.dalcourt.jonathan.translator.prepositions.SpatialActivity;

public class PrepositionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prepositions);

        // open Chronological category on click
        TextView chrono = findViewById(R.id.chronological_activity);
        chrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chronoIntent = new Intent(PrepositionsActivity.this, ChronologicalActivity.class);
                startActivity(chronoIntent);
            }
        });

        // open Spatial category on click
        TextView spatial = findViewById(R.id.spatial_activity);
        spatial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spatialIntent = new Intent(PrepositionsActivity.this, SpatialActivity.class);
                startActivity(spatialIntent);
            }
        });
    }
}