package com.example.movietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailedActivity extends AppCompatActivity {

    ImageView dposter;
    TextView dname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        dposter = findViewById(R.id.dposter);
        dname = findViewById(R.id.dname);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Integer image = intent.getIntExtra("poster", R.drawable.avatar_profile);

        dposter.setImageResource(image);
        dname.setText(name);
    }
}