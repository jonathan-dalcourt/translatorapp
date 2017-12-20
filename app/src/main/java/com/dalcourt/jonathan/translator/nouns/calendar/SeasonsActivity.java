package com.dalcourt.jonathan.translator.nouns.calendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Created by Jon on 11/23/2017.
 */

public class SeasonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.seasons_spring), "La Primavera"));
        words.add(new Word(getString(R.string.seasons_summer), "El Verano"));
        words.add(new Word(getString(R.string.seasons_fall), "El Otoño"));
        words.add(new Word(getString(R.string.seasons_winter), "El Invierno"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
