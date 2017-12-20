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

/**
 * To Do
 * V 1.0
 * Set onclick listeners to entire linear layout
 * Add views outside of listview
 * Create translations
 * Create Strings for Labels
 * Create Strings for all words
 * Add all activities to manifest
 * Organize files
 * Alphabetize order
 * line at bottom of categories?
 * Create arrays
 * Comment code
 * Standardize package names
 * V 2.0
 * Add local search function
 * Add web search function
 * Add tabs and sliding activities
 * Add audio examples
 * Add interactive translations (?)
 * V 3.0
 * Add multi language support
 * Add language setting
 * Vice-Versa support
 * <p>
 * categories (XML)
 * notes
 * translations
 * strings
 * classes
 * click listeners
 * word arrays
 */


/**
 * Creates click listeners for each category and opens that category on click
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // open Nouns category on click
        // Identify the TextView that we want to listen in on
        TextView nouns = findViewById(R.id.nouns_activity);
        // Create the click listener
        nouns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create the intent to launch when the TextView is clicked
                Intent nounsIntent = new Intent(
                        MainActivity.this, NounsActivity.class);
                startActivity(nounsIntent);
            }
        });

        // open Pronouns category on click
        TextView pronouns = findViewById(R.id.pronouns_activity);
        pronouns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pronounsIntent = new Intent(
                        MainActivity.this, PronounsActivity.class);
                startActivity(pronounsIntent);
            }
        });

        // open Verbs category on click
        TextView verbs = findViewById(R.id.verbs_activity);
        verbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verbsIntent = new Intent(
                        MainActivity.this, VerbsActivity.class);
                startActivity(verbsIntent);
            }
        });

        // open Adjectives category on click
        TextView adjectives = findViewById(R.id.adjectives_activity);
        adjectives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adjIntent = new Intent(
                        MainActivity.this, AdjectivesActivity.class);
                startActivity(adjIntent);
            }
        });

        // open Prepositions category on click
        TextView prepositions = findViewById(R.id.preps_activity);
        prepositions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prepsIntent = new Intent(
                        MainActivity.this, PrepositionsActivity.class);
                startActivity(prepsIntent);
            }
        });

        // Open Phrases category on click
        TextView phrases = findViewById(R.id.phrases_activity);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(
                        MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
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
