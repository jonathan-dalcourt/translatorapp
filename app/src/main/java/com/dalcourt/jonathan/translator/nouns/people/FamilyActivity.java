package com.dalcourt.jonathan.translator.nouns.people;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Family
 */

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.family_aunt), "Tía"));
        words.add(new Word(getString(R.string.family_brother), "Hermano"));
        words.add(new Word(getString(R.string.family_cousin), "Primo, Prima"));
        words.add(new Word(getString(R.string.family_daughter), "Hija"));
        words.add(new Word(getString(R.string.family_family), "Familia"));
        words.add(new Word(getString(R.string.family_father), "Padre"));
        words.add(new Word(getString(R.string.family_granddaughter), "Nieta"));
        words.add(new Word(getString(R.string.family_grandfather), "Abuelo"));
        words.add(new Word(getString(R.string.family_grandmother), "Abuela"));
        words.add(new Word(getString(R.string.family_grandson), "Nieto"));
        words.add(new Word(getString(R.string.family_mother), "Madre"));
        words.add(new Word(getString(R.string.family_nephew), "Sobrino"));
        words.add(new Word(getString(R.string.family_niece), "Sobrina"));
        words.add(new Word(getString(R.string.family_sister), "Hermana"));
        words.add(new Word(getString(R.string.family_son), "Hijo"));
        words.add(new Word(getString(R.string.family_uncle), "Tío"));


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
