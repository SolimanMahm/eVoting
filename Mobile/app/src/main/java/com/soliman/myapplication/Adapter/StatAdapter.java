package com.soliman.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.soliman.myapplication.R;
import com.soliman.myapplication.classes.Candidates;
import com.soliman.myapplication.classes.Stat;

import java.util.List;

public class StatAdapter extends ArrayAdapter<Stat> {
    public StatAdapter(Context context, List<Stat> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.table_item, parent, false);
        }
        Stat stat = getItem(position);
        ImageView Candidates = listitemView.findViewById(R.id.Candidates);
        TextView Number = listitemView.findViewById(R.id.Number);
        TextView Percent = listitemView.findViewById(R.id.percent);

        Candidates.setImageResource(stat.getImage());
        Number.setText((stat.getNumberOfVote()));
        Percent.setText(stat.getPercent());
        return listitemView;
    }
}
