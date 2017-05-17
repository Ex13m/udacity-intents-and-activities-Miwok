package com.example.android.miwok;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.rootView;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<String> words = new ArrayList<String>();

        words.add(0,"one");
        words.add(1,"two");
        words.add(2,"tree");
        words.add(3,"for");
        words.add(4,"five");
        words.add(5,"six");
        words.add(6,"seven");
        words.add(7,"eight");
        words.add(8,"nine");
        words.add(9,"ten");


        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        int index=0;
        Log.v("NumbersActivity","Index"+" " + "+"+" "+ index);
        TextView wordView = new TextView(this);
        wordView.setText(words.get(index));
        rootView.addView(wordView);


        index++;
        Log.v("NumbersActivity","Index"+" " + "+"+" "+ index);
        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(index));
        rootView.addView(wordView2);

        index++;
        Log.v("NumbersActivity","Index"+" " + "+"+" "+ index);
        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(index));
        rootView.addView(wordView3);



//        for (int i = 0; i < words.size(); i++) {
//            Log.v("NumbersActivity","Word at index" + " " + i+" "+"="+" "+ words.get(i));
        }


    }

