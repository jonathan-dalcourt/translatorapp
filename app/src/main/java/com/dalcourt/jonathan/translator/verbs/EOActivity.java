package com.dalcourt.jonathan.translator.verbs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * E - O
 */

public class EOActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.v_find), "Encontrar"));
        words.add(new Word(getString(R.string.v_give), "Dar"));
        words.add(new Word(getString(R.string.v_go), "Ir"));
        words.add(new Word(getString(R.string.v_have), "Tener"));
        words.add(new Word(getString(R.string.v_listen), "Escuchar"));
        words.add(new Word(getString(R.string.v_hope), "Esperar"));
        words.add(new Word(getString(R.string.v_hurt), "Doler"));
        words.add(new Word(getString(R.string.v_introduce), "Presentar"));
        words.add(new Word(getString(R.string.v_know_f), "Saber"));
        words.add(new Word(getString(R.string.v_know_p), "Conocer"));
        words.add(new Word(getString(R.string.v_laugh), "Reír"));
        words.add(new Word(getString(R.string.v_leave), "Salir"));
        words.add(new Word(getString(R.string.v_like), "Gustar"));
        words.add(new Word(getString(R.string.v_live), "Vivar"));
        words.add(new Word(getString(R.string.v_lose), "Perder"));
        words.add(new Word(getString(R.string.v_love), "Amar"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
