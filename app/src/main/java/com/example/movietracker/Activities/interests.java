package com.example.movietracker.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.movietracker.GridModelClass;
import com.example.movietracker.R;
import com.example.movietracker.myGridAdapter;

import java.util.ArrayList;

public class interests extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        gridView=findViewById(R.id.gridviewInterests);

        ArrayList<GridModelClass> modelClassArrayList = new ArrayList<GridModelClass>();



        myGridAdapter myGridAdapter = new myGridAdapter(this,modelClassArrayList);
        gridView.setAdapter(myGridAdapter);
    }
}