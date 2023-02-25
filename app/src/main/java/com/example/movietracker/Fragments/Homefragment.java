package com.example.movietracker.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.movietracker.Activities.DetailedActivity;
import com.example.movietracker.GridviewAdapter;
import com.example.movietracker.R;


public class Homefragment extends Fragment {


    GridView gridView;
    String[] itemname = {"The Shawshank Redemption (1994)"," The Godfather (1972)","The Dark Knight (2008)","The Godfather Part II (1974)",
    "12 Angry Men (1957)","Schindler's List (1993)"," The Lord of the Rings: The Return of the King (2003)"," Pulp Fiction (1994)",
    " The Lord of the Rings: The Fellowship of the Ring (2001)"," The Good, the Bad and the Ugly (1966)"," Forrest Gump (1994)","Fight Club (1999)",
    " The Lord of the Rings: The Two Towers (2002)","Inception (2010)","Star Wars: Episode V - The Empire Strikes Back (1980)","The Matrix (1999)",
    "Goodfellas (1990)","One Flew Over the Cuckoo's Nest (1975)","Se7en (1995)","Seven Samurai (1954)",
    "It's a Wonderful Life (1946)","The Silence of the Lambs (1991)","City of God (2002)","Saving Private Ryan (1998)"};
    Integer[] itemimage = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven,
            R.drawable.eight,R.drawable.nine,R.drawable.ten,R.drawable.eleven,R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen,
            R.drawable.fifteen,R.drawable.sixteen,R.drawable.seventeen,R.drawable.eighteen,R.drawable.nineteen,R.drawable.twenty,R.drawable.twentyone,
            R.drawable.twentytwo,R.drawable.twentythree,R.drawable.twentyfour};
    String[] itemlinks ={"https://www.youtube.com/watch?v=NmzuHjWmXOc","https://www.youtube.com/watch?v=UaVTIH8mujA","https://www.youtube.com/watch?v=LDG9bisJEaI","https://www.youtube.com/watch?v=9O1Iy9od7-A",
    "https://www.youtube.com/watch?v=_13J_9B5jEk","https://www.youtube.com/watch?v=mxphAlJID9U","https://www.youtube.com/watch?v=r5X-hFf6Bwo","https://www.youtube.com/watch?v=tGpTpVyI_OQ",
    "https://www.youtube.com/watch?v=V75dMMIW2B4","https://www.youtube.com/watch?v=WCN5JJY_wiA","https://www.youtube.com/watch?v=bLvqoHBptjg","https://www.youtube.com/watch?v=qtRKdVHc-cE",
    "https://www.youtube.com/watch?v=LbfMDwc4azU","https://www.youtube.com/watch?v=8hP9D6kZseM","https://www.youtube.com/watch?v=JNwNXF9Y6kY","https://www.youtube.com/watch?v=vKQi3bBA1y8",
    "https://www.youtube.com/watch?v=2ilzidi_J8Q","https://www.youtube.com/watch?v=OXrcDonY-B8","https://www.youtube.com/watch?v=znmZoVkCjpI","https://www.youtube.com/watch?v=wJ1TOratCTo",
    "https://www.youtube.com/watch?v=iLR3gZrU2Xo","https://www.youtube.com/watch?v=W6Mm8Sbe__o","https://www.youtube.com/watch?v=dcUOO4Itgmw","https://www.youtube.com/watch?v=9CiW_DgxCnQ"};


    public Homefragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homefragment, container, false);
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gridView = getView().findViewById(R.id.gridview);
        GridviewAdapter mycustomGridviewAdapter = new GridviewAdapter((Activity) getContext(), itemimage, itemname);
        gridView.setAdapter(mycustomGridviewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), DetailedActivity.class);
                intent.putExtra("name", itemname[i]);
                intent.putExtra("poster",itemimage[i]);
                intent.putExtra("links", itemlinks[i]);
                startActivity(intent);
            }
        });
    }

}