package com.dalcourt.jonathan.translator.nouns.countrieslangauges;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Nationalities
 */

public class NationalitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.nationality_african), "Africano"));
        words.add(new Word(getString(R.string.nationality_american), "Americano"));
        words.add(new Word(getString(R.string.nationality_asian), "Asiático"));
        words.add(new Word(getString(R.string.nationality_european), "Europeo"));
        words.add(new Word(getString(R.string.nationality_hispanic), "Hispano"));
        words.add(new Word(getString(R.string.nationality_mexican), "Mexicano"));
        words.add(new Word(getString(R.string.nationality_nationality),
                "Nacionalidad"));


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
