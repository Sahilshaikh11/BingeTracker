package com.example.movietracker.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.movietracker.R;

import org.w3c.dom.Text;

public class DetailedActivity extends AppCompatActivity {

    ImageView dposter;
    TextView dname;
    Button play;
    ImageButton watchl,info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        dposter = findViewById(R.id.dposter);
        dname = findViewById(R.id.dname);
        watchl = findViewById(R.id.watchlist);
        info = findViewById(R.id.info);

        watchl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Added to the  WatchList", Toast.LENGTH_LONG).show();
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Information's are yet to add", Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Integer image = intent.getIntExtra("poster", R.drawable.avatar_profile);
        String links = intent.getStringExtra("links");

        dposter.setImageResource(image);
        dname.setText(name);
        play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink(links);
            }
        });
    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}