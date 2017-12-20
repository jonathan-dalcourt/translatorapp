package com.dalcourt.jonathan.translator.nouns.numbers.ordinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * 10-19
 */

public class TwentyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.twenty_eleven), "Once"));
        words.add(new Word(getString(R.string.twenty_twelve), "Doce"));
        words.add(new Word(getString(R.string.twenty_thirteen), "Trece"));
        words.add(new Word(getString(R.string.twenty_fourteen), "Catorce"));
        words.add(new Word(getString(R.string.twenty_fifteen), "Quince"));
        words.add(new Word(getString(R.string.twenty_sixteen), "Dieciséis"));
        words.add(new Word(getString(R.string.twenty_seventeen), "Diecisiete"));
        words.add(new Word(getString(R.string.twenty_eighteen), "Dieciocho"));
        words.add(new Word(getString(R.string.twenty_nineteen), "Diecinueve"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
