package com.dalcourt.jonathan.translator.nouns.numbers.ordinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * 20-29
 */

public class ThirtyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.thirty_twenty), "Veinte"));
        words.add(new Word(getString(R.string.thirty_one), "Veintiuno"));
        words.add(new Word(getString(R.string.thirty_two), "Veintidos"));
        words.add(new Word(getString(R.string.thirty_three), "Veintitrés"));
        words.add(new Word(getString(R.string.thirty_four), "Veinticuatro"));
        words.add(new Word(getString(R.string.thirty_five), "Veinticinco"));
        words.add(new Word(getString(R.string.thirty_six), "Veintiséis"));
        words.add(new Word(getString(R.string.thirty_seven), "Veintisiete"));
        words.add(new Word(getString(R.string.thirty_eight), "Veintiocho"));
        words.add(new Word(getString(R.string.thirty_nine), "Veintinueve"));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
