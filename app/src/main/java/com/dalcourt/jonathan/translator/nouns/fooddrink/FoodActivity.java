package com.dalcourt.jonathan.translator.nouns.fooddrink;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Food
 */

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.food_apple), "La manzana"));
        words.add(new Word(getString(R.string.food_beans), "Los frijoles"));
        words.add(new Word(getString(R.string.food_breakfast), "El desayuno"));
        words.add(new Word(getString(R.string.food_chicken), "El pollo"));
        words.add(new Word(getString(R.string.food_dessert), "El postre"));
        words.add(new Word(getString(R.string.food_dinner), "La cena"));
        words.add(new Word(getString(R.string.food_food), "La comida"));
        words.add(new Word(getString(R.string.food_fruit), "El fruto"));
        words.add(new Word(getString(R.string.food_grape), "La uva"));
        words.add(new Word(getString(R.string.food_lemon), "El limón"));
        words.add(new Word(getString(R.string.food_lime), "La lima"));
        words.add(new Word(getString(R.string.food_lunch), "El almuerzo"));
        words.add(new Word(getString(R.string.food_meat), "El carne"));
        words.add(new Word(getString(R.string.food_orange), "La naranja"));
        words.add(new Word(getString(R.string.food_steak), "El filete"));
        words.add(new Word(getString(R.string.food_strawberry), "La fresea"));
        words.add(new Word(getString(R.string.food_tomato), "El tomate"));
        words.add(new Word(getString(R.string.food_vegetables), "El vegetal"));


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
