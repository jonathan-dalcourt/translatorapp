package com.dalcourt.jonathan.translator.nouns.people;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Persons
 */

public class PersonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.person_boy), "El chico"));
        words.add(new Word(getString(R.string.person_girl), "La chica"));
        words.add(new Word(getString(R.string.person_man), "El hombre"));
        words.add(new Word(getString(R.string.person_people), "El gente"));
        words.add(new Word(getString(R.string.person_person), "La persona"));
        words.add(new Word(getString(R.string.person_woman), "La mujer"));


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
