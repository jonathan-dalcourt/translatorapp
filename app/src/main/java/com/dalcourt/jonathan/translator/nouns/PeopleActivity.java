package com.dalcourt.jonathan.translator.nouns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.nouns.people.FamilyActivity;
import com.dalcourt.jonathan.translator.nouns.people.PersonsActivity;

/**
 * People
 */

public class PeopleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people);

        // Opens Family category on click
        TextView family = findViewById(R.id.family_activity);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(PeopleActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // opens persons category on click
        TextView persons = findViewById(R.id.persons_activity);
        persons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent personsIntent = new Intent(PeopleActivity.this, PersonsActivity.class);
                startActivity(personsIntent);
            }
        });
    }
}
