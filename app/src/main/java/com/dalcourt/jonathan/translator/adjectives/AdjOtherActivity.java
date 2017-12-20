package com.dalcourt.jonathan.translator.adjectives;

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

public class AdjOtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.other_bad), "Malo"));
        words.add(new Word(getString(R.string.other_early), "Pronto"));
        words.add(new Word(getString(R.string.other_fast), "Rápido"));
        words.add(new Word(getString(R.string.other_good), "Bueno"));
        words.add(new Word(getString(R.string.other_gross), "Asqueroso"));
        words.add(new Word(getString(R.string.other_important), "Importante"));
        words.add(new Word(getString(R.string.other_last), "Último"));
        words.add(new Word(getString(R.string.other_late), "Tarde"));
        words.add(new Word(getString(R.string.other_next), "Próximo"));
        words.add(new Word(getString(R.string.other_slow), "Lento"));
        words.add(new Word(getString(R.string.other_tasty), "Sabroso"));


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
