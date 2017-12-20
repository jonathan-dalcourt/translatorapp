package com.dalcourt.jonathan.translator.word;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;

import java.util.ArrayList;

/**
 * Creates a WordAdapter object extended from ArrayAdapter which provides the layout for each
 * item based on a data source, which is a list of Word objects.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView spanishTextView = listItemView.findViewById(R.id.spanish_trans);
        spanishTextView.setText(currentWord.getMSpanishWordWord());

        TextView defaultTransTextView = listItemView.findViewById(R.id.default_trans);
        defaultTransTextView.setText(currentWord.getMDefaultWord());

//        TextView altTranslation = (TextView) listItemView.findViewById(R.id.alternate_translation);
//        if (currentWord.hasAlt()) {
//            altTranslation.setText(currentWord.getMAlternateTranslation());
//        } else {
//            altTranslation.setVisibility(View.GONE);
//        }

        return listItemView;
    }


}
