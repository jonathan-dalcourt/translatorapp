package com.dalcourt.jonathan.translator.verbs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * P - S
 */

public class PSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.v_nap), "Dormitar"));
        words.add(new Word(getString(R.string.v_need), "Necesitar"));
        words.add(new Word(getString(R.string.v_open), "Abrir"));
        words.add(new Word(getString(R.string.v_pass), "Pasar"));
        words.add(new Word(getString(R.string.v_play), "Jugar"));
        words.add(new Word(getString(R.string.v_read), "Leer"));
        words.add(new Word(getString(R.string.v_remember), "Recordar"));
        words.add(new Word(getString(R.string.v_return), "Volver"));
        words.add(new Word(getString(R.string.v_run), "Correr"));
        words.add(new Word(getString(R.string.v_see), "Mirar"));
        words.add(new Word(getString(R.string.v_sell), "Vender"));
        words.add(new Word(getString(R.string.v_should), "Deber"));
        words.add(new Word(getString(R.string.v_sleep), "Dormir"));
        words.add(new Word(getString(R.string.v_speak), "Hablar"));
        words.add(new Word(getString(R.string.v_stay), "Quedar"));
        words.add(new Word(getString(R.string.v_swim), "Nadar"));


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
