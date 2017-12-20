package com.dalcourt.jonathan.translator.nouns.calendar;

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

public class MonthsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.months_january), "Enero"));
        words.add(new Word(getString(R.string.months_february), "Febrero"));
        words.add(new Word(getString(R.string.months_march), "Marzo"));
        words.add(new Word(getString(R.string.months_april), "Abril"));
        words.add(new Word(getString(R.string.months_may), "Mayo"));
        words.add(new Word(getString(R.string.months_june), "Junio"));
        words.add(new Word(getString(R.string.months_july), "Julio"));
        words.add(new Word(getString(R.string.months_august), "Agosto"));
        words.add(new Word(getString(R.string.months_september), "Septiembre"));
        words.add(new Word(getString(R.string.months_october), "Octubre"));
        words.add(new Word(getString(R.string.months_november), "Noviembre"));
        words.add(new Word(getString(R.string.months_december), "Diciembre"));
        words.add(new Word(getString(R.string.months_month), "Mes"));
        words.add(new Word(getString(R.string.months_last_month), "El mes pasado"));
        words.add(new Word(getString(R.string.months_this_month), "Este mes"));
        words.add(new Word(getString(R.string.months_next_month),
                "El mes que viene, El próximo mes "));
        words.add(new Word(getString(R.string.months__months_ago),
                "Hace unos meses "));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
