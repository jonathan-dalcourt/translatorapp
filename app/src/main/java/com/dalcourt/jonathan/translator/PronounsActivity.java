package com.dalcourt.jonathan.translator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.pronouns.DemonstrativeActivity;
import com.dalcourt.jonathan.translator.pronouns.IndefiniteActivity;
import com.dalcourt.jonathan.translator.pronouns.InterrogativeActivity;
import com.dalcourt.jonathan.translator.pronouns.PersonalActivity;
import com.dalcourt.jonathan.translator.pronouns.PronounNotesActivity;

/**
 * Creates click listeners for each category and opens that category on click
 */

public class PronounsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pronouns);

        // Opens Physical Attributes category on click
        TextView notes = findViewById(R.id.pronoun_notes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notesIntent = new Intent(
                        PronounsActivity.this, PronounNotesActivity.class);
                startActivity(notesIntent);
            }
        });


        // Opens Demonstrative category on click
        TextView demonstrative = findViewById(R.id.demonstrative_activity);
        demonstrative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent demonIntent = new Intent(PronounsActivity.this, DemonstrativeActivity.class);
                startActivity(demonIntent);
            }
        });

        // opens Indefinite category on click
        TextView indefinite = findViewById(R.id.indefinite_activity);
        indefinite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indefiniteIntent = new Intent(PronounsActivity.this, IndefiniteActivity.class);
                startActivity(indefiniteIntent);
            }
        });

        // opens Interrogative category on click
        TextView interrogative = findViewById(R.id.interrogative_activity);
        interrogative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent interrogativeIntent = new Intent(PronounsActivity.this, InterrogativeActivity.class);
                startActivity(interrogativeIntent);
            }
        });

        // opens Personal category on click
        TextView personal = findViewById(R.id.personal_activity);
        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent personalIntent = new Intent(PronounsActivity.this, PersonalActivity.class);
                startActivity(personalIntent);
            }
        });
    }
}
