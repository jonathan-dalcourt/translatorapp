package com.dalcourt.jonathan.translator;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.nouns.AnimalsActivity;
import com.dalcourt.jonathan.translator.nouns.CalendarActivity;
import com.dalcourt.jonathan.translator.nouns.ClothingActivity;
import com.dalcourt.jonathan.translator.nouns.Countries_LanguagesActivity;
import com.dalcourt.jonathan.translator.nouns.DirectionsActivity;
import com.dalcourt.jonathan.translator.nouns.FoodandDrinkActivity;
import com.dalcourt.jonathan.translator.nouns.HouseholdActivity;
import com.dalcourt.jonathan.translator.nouns.LandActivity;
import com.dalcourt.jonathan.translator.nouns.NounsNotesActivity;
import com.dalcourt.jonathan.translator.nouns.NumbersActivity;
import com.dalcourt.jonathan.translator.nouns.PartiesActivity;
import com.dalcourt.jonathan.translator.nouns.PeopleActivity;
import com.dalcourt.jonathan.translator.nouns.PlacesActivity;
import com.dalcourt.jonathan.translator.nouns.SchoolActivity;
import com.dalcourt.jonathan.translator.nouns.SportsActivity;
import com.dalcourt.jonathan.translator.nouns.TransportationActivity;

/**
 * Creates click listeners for each category and opens that category on click
 */

public class NounsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nouns);

        // Opens Physical Attributes category on click
        TextView notes = findViewById(R.id.nouns_notes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notesIntent = new Intent(
                        NounsActivity.this, NounsNotesActivity.class);
                startActivity(notesIntent);
            }
        });

        // open Numbers category on click
        TextView animals = findViewById(R.id.animals_activity);
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(NounsActivity.this, AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });

        // open Numbers category on click
        TextView numbers = findViewById(R.id.numbers_activity);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nounsIntent = new Intent(NounsActivity.this, NumbersActivity.class);
                startActivity(nounsIntent);
            }
        });

        // open Calendar category on click
        TextView calendar = findViewById(R.id.calendar_activity);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calendarIntent = new Intent(NounsActivity.this, CalendarActivity.class);
                startActivity(calendarIntent);
            }
        });

        // open Food category on click
        TextView food = findViewById(R.id.food_activity);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(NounsActivity.this, FoodandDrinkActivity.class);
                startActivity(foodIntent);
            }
        });

        // open Household category on click
        TextView household = findViewById(R.id.house_activity);
        household.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pronounsIntent = new Intent(NounsActivity.this, HouseholdActivity.class);
                startActivity(pronounsIntent);
            }
        });

        // open Sports category on click
        TextView sports = findViewById(R.id.sports_activity);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verbsIntent = new Intent(NounsActivity.this, SportsActivity.class);
                startActivity(verbsIntent);
            }
        });

        // open Countries category on click
        TextView countries = findViewById(R.id.countries_activity);
        countries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adjIntent = new Intent(NounsActivity.this, Countries_LanguagesActivity.class);
                startActivity(adjIntent);
            }
        });

        // open Family category on click
        TextView family = findViewById(R.id.family_activity);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prepsIntent = new Intent(NounsActivity.this, PeopleActivity.class);
                startActivity(prepsIntent);
            }
        });

        // open School category on click
        TextView school = findViewById(R.id.school_activity);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adjIntent = new Intent(NounsActivity.this, SchoolActivity.class);
                startActivity(adjIntent);
            }
        });


        // open Places category on click
        TextView places = findViewById(R.id.places_activity);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(NounsActivity.this, PlacesActivity.class);
                startActivity(phrasesIntent);
            }
        });


        // open Clothing category on click
        TextView clothing = findViewById(R.id.clothing_activity);
        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prepsIntent = new Intent(NounsActivity.this, ClothingActivity.class);
                startActivity(prepsIntent);
            }
        });

        // open Transportation category on click
        TextView trans = findViewById(R.id.trans_activity);
        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transIntent = new Intent(NounsActivity.this, TransportationActivity.class);
                startActivity(transIntent);
            }
        });

        // open Directions category on click
        TextView directions = findViewById(R.id.directions_activity);
        directions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent directionsIntent = new Intent(NounsActivity.this, DirectionsActivity.class);
                startActivity(directionsIntent);
            }
        });

        // open land category on click
        TextView land = findViewById(R.id.land_activity);
        land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent landIntent = new Intent(NounsActivity.this, LandActivity.class);
                startActivity(landIntent);
            }
        });

        // open Parties category on click
        TextView parties = findViewById(R.id.party_activity);
        parties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent partiesIntent = new Intent(NounsActivity.this, PartiesActivity.class);
                startActivity(partiesIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        return true;
    }
}