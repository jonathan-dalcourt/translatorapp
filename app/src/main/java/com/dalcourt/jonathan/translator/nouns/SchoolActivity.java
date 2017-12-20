package com.dalcourt.jonathan.translator.nouns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.nouns.school.ClassesActivity;
import com.dalcourt.jonathan.translator.nouns.school.SchoolPlacesActivity;

/**
 * School
 */

public class SchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nouns_school);

        // open Classes category on click
        TextView classes = findViewById(R.id.classes_activity);
        classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent classesIntent = new Intent(SchoolActivity.this,
                        ClassesActivity.class);
                startActivity(classesIntent);
            }
        });

        // open Other category on click
        TextView other = findViewById(R.id.school_other_activity);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherIntent = new Intent(SchoolActivity.this,
                        com.dalcourt.jonathan.translator.nouns.school.OtherActivity.class);
                startActivity(otherIntent);
            }
        });

        // open Places category on click
        TextView places = findViewById(R.id.places_activity);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placesIntent = new Intent(SchoolActivity.this,
                        SchoolPlacesActivity.class);
                startActivity(placesIntent);
            }
        });

    }
}
