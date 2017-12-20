package com.dalcourt.jonathan.translator.nouns.numbers.ordinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * 0-10
 */

public class TenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.ten_zero), "Cero"));
        words.add(new Word(getString(R.string.ten_one), "Uno"));
        words.add(new Word(getString(R.string.ten_one), "Dos"));
        words.add(new Word(getString(R.string.ten_one), "Tres"));
        words.add(new Word(getString(R.string.ten_one), "Cuatro"));
        words.add(new Word(getString(R.string.ten_one), "Cinco"));
        words.add(new Word(getString(R.string.ten_one), "Seis"));
        words.add(new Word(getString(R.string.ten_one), "Siete"));
        words.add(new Word(getString(R.string.ten_one), "Ocho"));
        words.add(new Word(getString(R.string.ten_one), "Nueve"));
        words.add(new Word(getString(R.string.ten_one), "Diez"));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
