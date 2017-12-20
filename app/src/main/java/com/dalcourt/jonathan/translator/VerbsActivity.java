package com.dalcourt.jonathan.translator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.verbs.ADActivity;
import com.dalcourt.jonathan.translator.verbs.EOActivity;
import com.dalcourt.jonathan.translator.verbs.PSActivity;
import com.dalcourt.jonathan.translator.verbs.TZActivity;
import com.dalcourt.jonathan.translator.verbs.VerbsNotesActivity;

public class VerbsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verbs);

        // Opens Notes category on click
        TextView notes = findViewById(R.id.verbs_notes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notesIntent = new Intent(
                        VerbsActivity.this, VerbsNotesActivity.class);
                startActivity(notesIntent);
            }
        });

        // open A-D category on click
        TextView ad = findViewById(R.id.ad);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adIntent = new Intent(VerbsActivity.this, ADActivity.class);
                startActivity(adIntent);
            }
        });

        // Opens E-O Attributes category on click
        TextView eo = findViewById(R.id.eo);
        eo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eoIntent = new Intent(
                        VerbsActivity.this, EOActivity.class);
                startActivity(eoIntent);
            }
        });

        // opens P-S Attributes category on click
        TextView ps = findViewById(R.id.ps);
        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent psIntent = new Intent(
                        VerbsActivity.this, PSActivity.class);
                startActivity(psIntent);
            }
        });

        // Opens T-Z Attributes category on click
        TextView tz = findViewById(R.id.tz);
        tz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tzIntent = new Intent(
                        VerbsActivity.this, TZActivity.class);
                startActivity(tzIntent);
            }
        });
    }
}
