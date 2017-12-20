package com.dalcourt.jonathan.translator.nouns.numbers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.nouns.numbers.ordinal.TenActivity;
import com.dalcourt.jonathan.translator.nouns.numbers.ordinal.TensActivity;
import com.dalcourt.jonathan.translator.nouns.numbers.ordinal.ThirtyActivity;
import com.dalcourt.jonathan.translator.nouns.numbers.ordinal.TwentyActivity;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Ordinal Numbers
 */

public class OrdinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_ordinal);

        // open 0-10 category on click
        TextView ten = findViewById(R.id.ten_activity);
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tenIntent = new Intent(OrdinalActivity.this, TenActivity.class);
                startActivity(tenIntent);
            }
        });

        // open 11-19 category on click
        TextView twenty = findViewById(R.id.twenty_activity);
        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twentyIntent = new Intent(OrdinalActivity.this, TwentyActivity.class);
                startActivity(twentyIntent);
            }
        });

        // open 20-29 category on click
        TextView thirty = findViewById(R.id.thirty_activity);
        thirty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirtyIntent = new Intent(OrdinalActivity.this, ThirtyActivity.class);
                startActivity(thirtyIntent);
            }
        });

        // open Tens category on click
        TextView tens = findViewById(R.id.tens_activity);
        tens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tensIntent = new Intent(OrdinalActivity.this, TensActivity.class);
                startActivity(tensIntent);
            }
        });


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.ordinal_hundred), "Cien"));
        words.add(new Word(getString(R.string.ordinal_thousand), "Mil"));
        words.add(new Word(getString(R.string.ordinal_million), "Millón"));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
