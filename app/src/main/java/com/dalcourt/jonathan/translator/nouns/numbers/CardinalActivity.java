package com.dalcourt.jonathan.translator.nouns.numbers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Created by Jon on 12/8/2017.
 */

public class CardinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.cardinal_first), "Primero"));
        words.add(new Word(getString(R.string.cardinal_second), "Segundo"));
        words.add(new Word(getString(R.string.cardinal_third), "Tercero"));
        words.add(new Word(getString(R.string.cardinal_fourth), "Cuarto"));
        words.add(new Word(getString(R.string.cardinal_fifth), "Quinto"));
        words.add(new Word(getString(R.string.cardinal_sixth), "Sexto"));
        words.add(new Word(getString(R.string.cardinal_seventh), "Séptimo"));
        words.add(new Word(getString(R.string.cardinal_eighth), "Octavo"));
        words.add(new Word(getString(R.string.cardinal_ninth), "Noveno"));
        words.add(new Word(getString(R.string.cardinal_tenth), "Décimo"));
        words.add(new Word(getString(R.string.cardinal_last), "El último"));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
