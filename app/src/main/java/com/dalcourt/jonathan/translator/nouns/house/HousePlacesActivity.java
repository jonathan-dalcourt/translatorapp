package com.dalcourt.jonathan.translator.nouns.house;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * House Places
 */

public class HousePlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.house_places_apartment),
                "El apartamento"));
        words.add(new Word(getString(R.string.house_places_bsaement),
                "El sótano"));
        words.add(new Word(getString(R.string.house_places_bedroom),
                "El cuarto, el dormitorio"));
        words.add(new Word(getString(R.string.house_places_dining),
                "El comedor"));
        words.add(new Word(getString(R.string.house_places_floor),
                "El piso"));
        words.add(new Word(getString(R.string.house_places_garden),
                "El jardín"));
        words.add(new Word(getString(R.string.house_places_house),
                "La casa"));
        words.add(new Word(getString(R.string.house_places_kitchen),
                "La cocina"));
        words.add(new Word(getString(R.string.house_places_laundry),
                "El cuarto de lavado"));
        words.add(new Word(getString(R.string.house_places_living),
                "La sala de estar"));
        words.add(new Word(getString(R.string.house_places_patio),
                "El patio"));
        words.add(new Word(getString(R.string.house_places_stairs),
                "Las escaleras"));


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
