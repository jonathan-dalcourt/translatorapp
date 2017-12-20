package com.dalcourt.jonathan.translator.nouns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Transportation
 */

public class TransportationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.transportation_airplane), "El avión"));
        words.add(new Word(getString(R.string.transportation_bike), "La bicicleta"));
        words.add(new Word(getString(R.string.transportation_bus), "El autobús"));
        words.add(new Word(getString(R.string.transportation_car), "El carro"));
        words.add(new Word(getString(R.string.transportation_chariot),
                "La máquina de guerra"));
        words.add(new Word(getString(R.string.transportation_skateboard),
                "El patinador"));
        words.add(new Word(getString(R.string.transportation_subway), "El metro"));
        words.add(new Word(getString(R.string.transportation_train), "El tren"));


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
