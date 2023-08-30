package com.soliman.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.soliman.myapplication.classes.Election;
import com.soliman.myapplication.R;

import java.util.ArrayList;

public class ElectionAdapter extends ArrayAdapter<Election> {
    public ElectionAdapter(Context context, ArrayList<Election> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View currentListView = convertView;
        if (currentListView == null) {
            currentListView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Election currentElection = getItem(position);

        TextView tv_Topic = currentListView.findViewById(R.id.textView14);
        tv_Topic.setText(currentElection.getTopic());

        TextView tv_Countdown = currentListView.findViewById(R.id.textView16);
        tv_Countdown.setText(currentElection.getEndDate()); // TODO Function to calculate Countdown

        return currentListView;
    }
}
