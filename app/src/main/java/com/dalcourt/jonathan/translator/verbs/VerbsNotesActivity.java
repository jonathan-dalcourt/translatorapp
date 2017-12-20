package com.dalcourt.jonathan.translator.verbs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.verbs.verbsnotes.ConjugationActivity;
import com.dalcourt.jonathan.translator.verbs.verbsnotes.GustarActivity;
import com.dalcourt.jonathan.translator.verbs.verbsnotes.Ser_EstarActivity;

/**
 * Verbs Notes
 */

public class VerbsNotesActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verbs_notes);

        // Opens Conjugations category on click
        TextView conj = findViewById(R.id.conjugation_activity);
        conj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conjIntent = new Intent(
                        VerbsNotesActivity.this, ConjugationActivity.class);
                startActivity(conjIntent);
            }
        });

        // open Gustar category on click
        TextView gustar = findViewById(R.id.gustar_activity);
        gustar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gustarIntent = new Intent(VerbsNotesActivity.this, GustarActivity.class);
                startActivity(gustarIntent);
            }
        });

        // Opens Ser vs. Estar Attributes category on click
        TextView ser = findViewById(R.id.ser_estar_activity);
        ser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent serIntent = new Intent(
                        VerbsNotesActivity.this, Ser_EstarActivity.class);
                startActivity(serIntent);
            }
        });
    }
}
