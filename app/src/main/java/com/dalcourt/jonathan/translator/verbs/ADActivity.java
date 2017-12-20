package com.dalcourt.jonathan.translator.verbs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * A - D
 */

public class ADActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.v_arrive), "Llegar"));
        words.add(new Word(getString(R.string.v_ask), "Preguntar"));
        words.add(new Word(getString(R.string.v_ask_for), "Pedir"));
        words.add(new Word(getString(R.string.v_bathe), "Bañarse"));
        words.add(new Word(getString(R.string.v_be), "Estar, Ser"));
        words.add(new Word(getString(R.string.v_begin), "Empezar"));
        words.add(new Word(getString(R.string.v_believe), "Creer"));
        words.add(new Word(getString(R.string.v_bring), "Traer"));
        words.add(new Word(getString(R.string.v_buy), "Comprar"));
        words.add(new Word(getString(R.string.v_call), "Llamar"));
        words.add(new Word(getString(R.string.v_celebrate), "Celebrar"));
        words.add(new Word(getString(R.string.v_clean), "Limpiar"));
        words.add(new Word(getString(R.string.v_close), "Cerrar"));
        words.add(new Word(getString(R.string.v_come), "Vener"));
        words.add(new Word(getString(R.string.v_continue), "Siguir"));
        words.add(new Word(getString(R.string.v_die), "Morter"));
        words.add(new Word(getString(R.string.v_do), "Hacer"));
        words.add(new Word(getString(R.string.v_drink), "Beber"));


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
