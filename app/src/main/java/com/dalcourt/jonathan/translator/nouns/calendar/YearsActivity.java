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

public class YearsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.years_year), "Año"));
        words.add(new Word(getString(R.string.years_last_year), "El año pasado"));
        words.add(new Word(getString(R.string.years_this_year), "Este año"));
        words.add(new Word(getString(R.string.years_next_year),
                "Al año que viene, El próximo año"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
