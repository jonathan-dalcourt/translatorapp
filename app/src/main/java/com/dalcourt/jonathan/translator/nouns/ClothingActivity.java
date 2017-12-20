package com.dalcourt.jonathan.translator.nouns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.nouns.clothing.BottomActivity;
import com.dalcourt.jonathan.translator.nouns.clothing.ClothesOtherActivity;
import com.dalcourt.jonathan.translator.nouns.clothing.JewelleryActivity;
import com.dalcourt.jonathan.translator.nouns.clothing.ShoesActivity;
import com.dalcourt.jonathan.translator.nouns.clothing.TopActivity;
import com.dalcourt.jonathan.translator.word.Word;
import com.dalcourt.jonathan.translator.word.WordAdapter;

import java.util.ArrayList;

/**
 * Clothing Nouns
 */

public class ClothingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nouns_clothing);

        // open Bottom category on click
        TextView bottom = findViewById(R.id.bottom_activity);
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bottomIntent = new Intent(ClothingActivity.this, BottomActivity.class);
                startActivity(bottomIntent);
            }
        });

        // open Jewellery category on click
        TextView jew = findViewById(R.id.jewellery_activity);
        jew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jewIntent = new Intent(ClothingActivity.this, JewelleryActivity.class);
                startActivity(jewIntent);
            }
        });

        // open Other category on click
        TextView other = findViewById(R.id.other_activity);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherIntent = new Intent(ClothingActivity.this, ClothesOtherActivity.class);
                startActivity(otherIntent);
            }
        });

        // open Shoes category on click
        TextView shoes = findViewById(R.id.shoes_activity);
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoesIntent = new Intent(ClothingActivity.this, ShoesActivity.class);
                startActivity(shoesIntent);
            }
        });

        // open Tops category on click
        TextView tops = findViewById(R.id.tops_activity);
        tops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topsIntent = new Intent(ClothingActivity.this, TopActivity.class);
                startActivity(topsIntent);
            }
        });

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.clothing_clothes), "Las ropas"));


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
