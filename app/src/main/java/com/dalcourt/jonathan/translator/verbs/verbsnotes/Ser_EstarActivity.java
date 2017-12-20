package com.dalcourt.jonathan.translator.verbs.verbsnotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;

/**
 * Ser v. Estar
 */

public class Ser_EstarActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verbs_ser_estar);

        // Opens Ser category on click
        TextView ser = findViewById(R.id.ser_activity);
        ser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent serIntent = new Intent(
                        Ser_EstarActivity.this, SerActivity.class);
                startActivity(serIntent);
            }
        });

        // open Estar category on click
        TextView estar = findViewById(R.id.estar_activity);
        estar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent estarIntent = new Intent(Ser_EstarActivity.this, EstarActivity.class);
                startActivity(estarIntent);
            }
        });

    }
}
