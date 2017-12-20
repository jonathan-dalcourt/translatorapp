package com.dalcourt.jonathan.translator.pronouns;

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

public class InterrogativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.int_how), "Cómo"));
        words.add(new Word(getString(R.string.int_how_many), "Cuántos"));
        words.add(new Word(getString(R.string.int_what), "Qué"));
        words.add(new Word(getString(R.string.int_when), "Cuándo"));
        words.add(new Word(getString(R.string.int_where), "Dónde"));
        words.add(new Word(getString(R.string.int_which), "Cuál, Cuáles"));
        words.add(new Word(getString(R.string.int_who), "Quién, Quiénes"));
        words.add(new Word(getString(R.string.int_whose), "Cuyo"));

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
