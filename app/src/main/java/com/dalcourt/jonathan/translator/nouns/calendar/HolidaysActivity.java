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

public class HolidaysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.holidays_new_years),
                "El día de Año Nuevo"));
        words.add(new Word(getString(R.string.holidays_valentines),
                "El día de San Valentín, Día de los Enamorados"));
        words.add(new Word(getString(R.string.holidays_april_fools),
                "El día de los Inocentes"));
        words.add(new Word(getString(R.string.holidays_passover),
                "La Pascua de los hebreos"));
        words.add(new Word(getString(R.string.holidays_ash_wednesday),
                "Miércoles de ceniza"));
        words.add(new Word(getString(R.string.holidays_lent), "La Cuaresma"));
        words.add(new Word(getString(R.string.holidays_good_friday),
                "El Viernes Santo"));
        words.add(new Word(getString(R.string.holidays_easter), "La Pascua"));
        words.add(new Word(getString(R.string.holidays_mothers_day),
                "El día de la Madre"));
        words.add(new Word(getString(R.string.holidays_memorial_day),
                "El día de Comemoración de los Caídos"));
        words.add(new Word(getString(R.string.holidays_fathers_day),
                "El día del Padre"));
        words.add(new Word(getString(R.string.holidays_independence_day),
                "El día de la Independencia"));
        words.add(new Word(getString(R.string.holidays_labor_day),
                "El día del Trabajo"));
        words.add(new Word(getString(R.string.holidays_rosh_hashanah),
                "Rosh Hashanah"));
        words.add(new Word(getString(R.string.holidays_yom_kippur),
                "Yom Kipur"));
        words.add(new Word(getString(R.string.holidays_columbus_day),
                "El día de la Raza"));
        words.add(new Word(getString(R.string.holidays_halloween),
                "La noche de Brujas"));
        words.add(new Word(getString(R.string.holidays_thanksgiving),
                "El día de Acción de Gracias"));
        words.add(new Word(getString(R.string.holidays_hanukkuh), "Hanukkuh"));
        words.add(new Word(getString(R.string.holidays_christmas_eve),
                "La Nochebuena"));
        words.add(new Word(getString(R.string.holidays_christmas), "La Navidad"));
        words.add(new Word(getString(R.string.holidays_new_years_eve),
                "La Nochevieja, El Fin de Año"));
        words.add(new Word(getString(R.string.holidays_wedding), "La boda"));
        words.add(new Word(getString(R.string.holidays_wedding_anniversary),
                "El aniversario de boda"));
        words.add(new Word(getString(R.string.holidays_birthday), "El cumpleaños"));
        words.add(new Word(getString(R.string.holidays_vacation), "La vacación"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
