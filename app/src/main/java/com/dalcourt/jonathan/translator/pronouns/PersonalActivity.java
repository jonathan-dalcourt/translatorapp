package com.dalcourt.jonathan.translator.pronouns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.pronouns.personal.ObjectActivity;
import com.dalcourt.jonathan.translator.pronouns.personal.PossessiveDependent;
import com.dalcourt.jonathan.translator.pronouns.personal.PossessiveIndependent;
import com.dalcourt.jonathan.translator.pronouns.personal.ReflexiveActivity;
import com.dalcourt.jonathan.translator.pronouns.personal.SubjectActivity;

/**
 * Created by Jon on 11/23/2017.
 */

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal);

        // Opens Object category on click
        TextView object = findViewById(R.id.object_activity);
        object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent objectIntent = new Intent(PersonalActivity.this, ObjectActivity.class);
                startActivity(objectIntent);
            }
        });

        // opens Possessive Dependent category on click
        TextView possDep = findViewById(R.id.poss_dep_activity);
        possDep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent possDepIntent = new Intent(PersonalActivity.this, PossessiveDependent.class);
                startActivity(possDepIntent);
            }
        });

        // opens Possessive Independent category on click
        TextView possInd = findViewById(R.id.poss_ind_activity);
        possInd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent interrogativeIntent = new Intent(PersonalActivity.this, PossessiveIndependent.class);
                startActivity(interrogativeIntent);
            }
        });

        // opens Reflexive category on click
        TextView reflexive = findViewById(R.id.reflexive_activity);
        reflexive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reflexiveIntent = new Intent(PersonalActivity.this, ReflexiveActivity.class);
                startActivity(reflexiveIntent);
            }
        });

        // opens Subject category on click
        TextView subject = findViewById(R.id.subject_activity);
        subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent subjectIntent = new Intent(PersonalActivity.this, SubjectActivity.class);
                startActivity(subjectIntent);
            }
        });
    }
}
