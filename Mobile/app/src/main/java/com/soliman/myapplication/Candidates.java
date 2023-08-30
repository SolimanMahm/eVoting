package com.soliman.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.soliman.myapplication.Adapter.CandidatesAdapter;

import java.util.ArrayList;

public class Candidates extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidates);

        gridView = findViewById(R.id.gridView);
        ArrayList<com.soliman.myapplication.classes.Candidates> courseModelArrayList = new ArrayList<com.soliman.myapplication.classes.Candidates>();

        courseModelArrayList.add(new com.soliman.myapplication.classes.Candidates("DSA","DSA", R.drawable.facebook));
        courseModelArrayList.add(new com.soliman.myapplication.classes.Candidates("JAVA","DSA", R.drawable.google));
        courseModelArrayList.add(new com.soliman.myapplication.classes.Candidates("C++","DSA", R.drawable.google));
        courseModelArrayList.add(new com.soliman.myapplication.classes.Candidates("DSA","DSA", R.drawable.facebook));
        courseModelArrayList.add(new com.soliman.myapplication.classes.Candidates("JAVA","DSA", R.drawable.google));
        courseModelArrayList.add(new com.soliman.myapplication.classes.Candidates("C++","DSA", R.drawable.google));

        CandidatesAdapter adapter = new CandidatesAdapter(this, courseModelArrayList);
        gridView.setAdapter(adapter);
    }
}