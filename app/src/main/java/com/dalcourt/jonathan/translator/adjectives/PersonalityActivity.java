package com.dalcourt.jonathan.translator.adjectives;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Created by Jon on 11/25/2017.
 */

public class PersonalityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.physical_bald), "Calvo"));
        words.add(new Word(getString(R.string.physical_beautiful), "Linda"));
        words.add(new Word(getString(R.string.physical_big), "Grande"));
        words.add(new Word(getString(R.string.physical_blonde), "Rubio"));
        words.add(new Word(getString(R.string.physical_brunnette), "Morena"));
        words.add(new Word(getString(R.string.physical_dry), "Pequeño"));
        words.add(new Word(getString(R.string.physical_fat), "Seco"));
        words.add(new Word(getString(R.string.physical_handsome), "Gordo"));
        words.add(new Word(getString(R.string.physical_long), "Guapo"));
        words.add(new Word(getString(R.string.physical_new), "Largo"));
        words.add(new Word(getString(R.string.physical_old), "Nuevo"));
        words.add(new Word(getString(R.string.physical_pretty), "Viejo"));
        words.add(new Word(getString(R.string.physical_redhead), "Bonita"));
        words.add(new Word(getString(R.string.physical_short), "Pelirrojo"));
        words.add(new Word(getString(R.string.physical_silver_hair), "Corto"));
        words.add(new Word(getString(R.string.physical_skinny), "Canoso"));
        words.add(new Word(getString(R.string.physical_small), "Delgada"));
        words.add(new Word(getString(R.string.physical_strong), "Fuerte"));
        words.add(new Word(getString(R.string.physical_tall), "Alto"));
        words.add(new Word(getString(R.string.physical_ugly), "Feo"));

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
