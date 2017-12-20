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

public class DaysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.days_monday), "Lunes"));
        words.add(new Word(getString(R.string.days_tuesday), "Martes"));
        words.add(new Word(getString(R.string.days_wednesday), "Miércoles"));
        words.add(new Word(getString(R.string.days_thursday), "Jueves"));
        words.add(new Word(getString(R.string.days_friday), "Viernes"));
        words.add(new Word(getString(R.string.days_saturday), "Sábado"));
        words.add(new Word(getString(R.string.days_sunday), "Domingo"));
        words.add(new Word(getString(R.string.days_day), "Día"));
        words.add(new Word(getString(R.string.days_yesterday), "Ayer"));
        words.add(new Word(getString(R.string.days_today), "Hoy"));
        words.add(new Word(getString(R.string.days_tomorrow), "Mañana"));
        words.add(new Word(getString(R.string.days_week), "Semana"));
        words.add(new Word(getString(R.string.days_weekday), "Día de la semana"));
        words.add(new Word(getString(R.string.days_weekend), "Fin de semana"));
        words.add(new Word(getString(R.string.days_last_week), "La semana pasada "));
        words.add(new Word(getString(R.string.days_this_week), "Esta semana "));
        words.add(new Word(getString(R.string.days_next_week),
                "La semana que viene, La próxima semana "));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
