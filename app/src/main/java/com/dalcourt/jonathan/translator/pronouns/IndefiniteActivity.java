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

public class IndefiniteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.ind_all), "Todos"));
        words.add(new Word(getString(R.string.ind_anyone), "Calquiera"));
        words.add(new Word(getString(R.string.ind_anything), "Calquier cosa"));
        words.add(new Word(getString(R.string.ind_both), "Los dos"));
        words.add(new Word(getString(R.string.ind_each), "Cada"));
        words.add(new Word(getString(R.string.ind_everyone),
                "Todo, Toda, Todos, Todas"));
        words.add(new Word(getString(R.string.ind_few),
                "Poco, Poca, Pocos, Pocas"));
        words.add(new Word(getString(R.string.ind_most), "Más"));
        words.add(new Word(getString(R.string.ind_no_one), "Nadie"));
        words.add(new Word(getString(R.string.ind_none), "Ninguno, Ninguna"));
        words.add(new Word(getString(R.string.ind_nothing), "nada"));
        words.add(new Word(getString(R.string.ind_other),
                "Otro, Otra, Otros, Otras"));
        words.add(new Word(getString(R.string.ind_some),
                "Uno, Una, Unos, Unas"));
        words.add(new Word(getString(R.string.ind_someone), "Alguien"));
        words.add(new Word(getString(R.string.ind_something), "Algo"));

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
