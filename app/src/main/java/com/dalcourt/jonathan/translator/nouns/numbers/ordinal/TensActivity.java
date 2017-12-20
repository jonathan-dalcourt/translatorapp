package com.dalcourt.jonathan.translator.nouns.numbers.ordinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Tens
 */

public class TensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.ten_one), "Diez"));
        words.add(new Word(getString(R.string.thirty_twenty), "Veinte"));
        words.add(new Word(getString(R.string.tens_thirty), "Treinta"));
        words.add(new Word(getString(R.string.tens_forty), "Cuarenta"));
        words.add(new Word(getString(R.string.tens_fifty), "Cincuenta"));
        words.add(new Word(getString(R.string.tens_sixty), "Sesenta"));
        words.add(new Word(getString(R.string.tens_seventy), "Setenta"));
        words.add(new Word(getString(R.string.tens_eighty), "Ochenta"));
        words.add(new Word(getString(R.string.tens_ninety), "Noventa"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
