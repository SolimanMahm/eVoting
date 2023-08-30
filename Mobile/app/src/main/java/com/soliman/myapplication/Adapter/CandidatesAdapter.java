package com.soliman.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.soliman.myapplication.R;
import com.soliman.myapplication.classes.*;

import java.util.ArrayList;

public class CandidatesAdapter extends ArrayAdapter<Candidates> {
    public CandidatesAdapter(Context context, ArrayList<Candidates> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        Candidates candidates = getItem(position);
        TextView Name = listitemView.findViewById(R.id.textView);
        TextView Description = listitemView.findViewById(R.id.textView);
        ImageView Image = listitemView.findViewById(R.id.imageView);

        Name.setText(candidates.getName());
        Description.setText((candidates.getDescription()));
        Image.setImageResource(candidates.getImgid());
        return listitemView;
    }
}
