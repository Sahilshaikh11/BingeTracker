package com.example.movietracker;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GridviewAdapter extends ArrayAdapter<Integer> {
    Integer[] image;
    String[] name;
    Activity context;

    public GridviewAdapter(@NonNull Activity context, Integer[] image, String[] name) {
        super(context, R.layout.customlistviewhome, image);
        this.image = image;
        this.name = name;
        this.context = context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.customlistviewhome,null,true);

        ImageView imageView = rowView.findViewById(R.id.gridimage);
        TextView textView = rowView.findViewById(R.id.gridtext);

        imageView.setImageResource(image[position]);
        textView.setText(name[position]);
        return rowView;
    }
}
