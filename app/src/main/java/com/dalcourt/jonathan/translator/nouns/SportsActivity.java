package com.dalcourt.jonathan.translator.nouns;

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

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.sport_baseball), "El beisbol"));
        words.add(new Word(getString(R.string.sport_basketball), "El baloncesto"));
        words.add(new Word(getString(R.string.sport_court), "La corte"));
        words.add(new Word(getString(R.string.sport_field), "El campo"));
        words.add(new Word(getString(R.string.sport_football),
                "El fútbol Americano"));
        words.add(new Word(getString(R.string.sport_game), "El partido"));
        words.add(new Word(getString(R.string.sport_soccer), "El fútbol"));
        words.add(new Word(getString(R.string.sport_team), "El equipo"));
        words.add(new Word(getString(R.string.sport_volleyball), "El voleibol"));


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
