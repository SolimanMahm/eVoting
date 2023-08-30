package com.soliman.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TableLayout;

import com.soliman.myapplication.Adapter.ElectionAdapter;
import com.soliman.myapplication.Adapter.StatAdapter;
import com.soliman.myapplication.classes.Candidates;
import com.soliman.myapplication.classes.Election;
import com.soliman.myapplication.classes.Stat;

import java.util.ArrayList;

public class Stats extends AppCompatActivity {

    ListView listView;

    ArrayList<Stat> stats = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        listView = findViewById(R.id.table);

        StatAdapter adapter = new StatAdapter(getApplicationContext(), stats);
        listView.setAdapter(adapter);

        stats.add(new Stat(R.drawable.facebook, "2", "3"));
        stats.add(new Stat(R.drawable.facebook, "2", "3"));
        stats.add(new Stat(R.drawable.facebook, "2", "3"));
        stats.add(new Stat(R.drawable.facebook, "2", "3"));
        stats.add(new Stat(R.drawable.facebook, "2", "3"));

        adapter.notifyDataSetChanged();
    }
}