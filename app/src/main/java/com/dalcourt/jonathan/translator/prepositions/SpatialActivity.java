package com.dalcourt.jonathan.translator.prepositions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Created by Jon on 11/29/2017.
 */

public class SpatialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.prep_at), "A"));
        words.add(new Word(getString(R.string.prep_away), "Lejos de"));
        words.add(new Word(getString(R.string.prep_behind), "Detrás"));
        words.add(new Word(getString(R.string.prep_between), "Entre"));
        words.add(new Word(getString(R.string.prep_from), "Desde"));
        words.add(new Word(getString(R.string.prep_in_front_of), "Delante de"));
        words.add(new Word(getString(R.string.prep_in), "En"));
        words.add(new Word(getString(R.string.prep_into), "Dentro"));
        words.add(new Word(getString(R.string.prep_of), "De"));
        words.add(new Word(getString(R.string.prep_on), "En"));
        words.add(new Word(getString(R.string.prep_outside), "Fuera de"));
        words.add(new Word(getString(R.string.prep_over), "Sobre"));
        words.add(new Word(getString(R.string.prep_through), "A través de"));
        words.add(new Word(getString(R.string.prep_towards), "Hacia"));
        words.add(new Word(getString(R.string.prep_under), "Bajo"));
        words.add(new Word(getString(R.string.prep_with), "Con"));


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
