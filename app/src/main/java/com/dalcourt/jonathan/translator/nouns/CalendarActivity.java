package com.dalcourt.jonathan.translator.nouns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dalcourt.jonathan.translator.R;
import com.dalcourt.jonathan.translator.nouns.calendar.DaysActivity;
import com.dalcourt.jonathan.translator.nouns.calendar.HolidaysActivity;
import com.dalcourt.jonathan.translator.nouns.calendar.MonthsActivity;
import com.dalcourt.jonathan.translator.nouns.calendar.SeasonsActivity;
import com.dalcourt.jonathan.translator.nouns.calendar.YearsActivity;

/**
 * Created by Jon on 11/23/2017.
 */

public class CalendarActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        // open Days category on click
        TextView days = findViewById(R.id.days_activity);
        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daysIntent = new Intent(CalendarActivity.this, DaysActivity.class);
                startActivity(daysIntent);
            }
        });

        // open Months category on click
        TextView months = findViewById(R.id.months_activity);
        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monthsIntent = new Intent(CalendarActivity.this, MonthsActivity.class);
                startActivity(monthsIntent);
            }
        });

        // open Years category on click
        TextView years = findViewById(R.id.years_activity);
        years.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yearsIntent = new Intent(CalendarActivity.this, YearsActivity.class);
                startActivity(yearsIntent);
            }
        });

        // open Seasons category on click
        TextView seasons = findViewById(R.id.seasons_activity);
        seasons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seasonsIntent = new Intent(CalendarActivity.this, SeasonsActivity.class);
                startActivity(seasonsIntent);
            }
        });

        // open Holidays category on click
        TextView holidays = findViewById(R.id.holidays_activity);
        holidays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent holidaysIntent = new Intent(CalendarActivity.this, HolidaysActivity.class);
                startActivity(holidaysIntent);
            }
        });

    }

}
