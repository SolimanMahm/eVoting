package com.soliman.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.soliman.myapplication.Adapter.ElectionAdapter;
import com.soliman.myapplication.classes.Election;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ListView listView;

    ArrayList<Election> elections = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = findViewById(R.id.list_item);

        ElectionAdapter adapter = new ElectionAdapter(getApplicationContext(), elections);
        listView.setAdapter(adapter);

        elections.add(new Election("Election Topic", "1", "80hrs, 103mins, 804secs"));

        elections.add(new Election("Election Topic", "1", "80hrs, 103mins, 804secs"));

        elections.add(new Election("Election Topic", "1", "80hrs, 103mins, 804secs"));

        elections.add(new Election("Election Topic", "1", "80hrs, 103mins, 804secs"));

        adapter.notifyDataSetChanged();

    }
}