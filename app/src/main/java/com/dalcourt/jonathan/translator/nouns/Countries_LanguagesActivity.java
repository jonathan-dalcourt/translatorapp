package com.dalcourt.jonathan.translator.nouns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.nouns.countrieslangauges.CountriesActivity;
import com.dalcourt.jonathan.translator.nouns.countrieslangauges.LanguagesActivity;
import com.dalcourt.jonathan.translator.nouns.countrieslangauges.NationalitiesActivity;

/**
 * Creates click listeners for each category and opens that category on click
 */

public class Countries_LanguagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.countries_langauges);

        // Opens Countries category on click
        TextView countries = findViewById(R.id.countries_activity);
        countries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent countriesIntent = new Intent(Countries_LanguagesActivity.this, CountriesActivity.class);
                startActivity(countriesIntent);
            }
        });

        // opens Languages category on click
        TextView languages = findViewById(R.id.languages_activity);
        languages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent langIntent = new Intent(Countries_LanguagesActivity.this, LanguagesActivity.class);
                startActivity(langIntent);
            }
        });

        // opens Nationalities category on click
        TextView nationalities = findViewById(R.id.nation_activity);
        nationalities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nationalitiesIntent = new Intent(Countries_LanguagesActivity.this, NationalitiesActivity.class);
                startActivity(nationalitiesIntent);
            }
        });
    }
}