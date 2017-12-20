package com.dalcourt.jonathan.translator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.adjectives.AdjNotesActivity;
import com.dalcourt.jonathan.translator.adjectives.AdjOtherActivity;
import com.dalcourt.jonathan.translator.adjectives.ColorsActivity;
import com.dalcourt.jonathan.translator.adjectives.PersonalityActivity;
import com.dalcourt.jonathan.translator.adjectives.PhysicalActivity;

public class AdjectivesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adjectives);

        // Opens Physical Attributes category on click
        TextView notes = findViewById(R.id.adj_notes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notesIntent = new Intent(
                        AdjectivesActivity.this, AdjNotesActivity.class);
                startActivity(notesIntent);
            }
        });

        // open Colors category on click
        TextView colors = findViewById(R.id.colors_activity);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(AdjectivesActivity.this, ColorsActivity.class);
                startActivity(phrasesIntent);
            }
        });

        // Opens Physical Attributes category on click
        TextView physical = findViewById(R.id.physical_activity);
        physical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent physicalIntent = new Intent(
                        AdjectivesActivity.this, PhysicalActivity.class);
                startActivity(physicalIntent);
            }
        });

        // opens Personality Attributes category on click
        TextView personality = findViewById(R.id.personality_activity);
        personality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent personalityIntent = new Intent(
                        AdjectivesActivity.this, PersonalityActivity.class);
                startActivity(personalityIntent);
            }
        });

        // Opens Physical Attributes category on click
        TextView other = findViewById(R.id.adj_other_activity);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherIntent = new Intent(
                        AdjectivesActivity.this, AdjOtherActivity.class);
                startActivity(otherIntent);
            }
        });
    }
}