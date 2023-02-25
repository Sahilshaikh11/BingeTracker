
package com.example.movietracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    ViewPager2 viewPager2;
    BottomNavigationView bottomNavigationView;
    ArrayList<Fragment> fragmentArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.ViewPager);
        fragmentArrayList.add(new Homefragment());
        fragmentArrayList.add(new TrackerFragment());
        fragmentArrayList.add(new ProfileFragment());

        ViewPageradapter viewPageradapter = new ViewPageradapter(this, fragmentArrayList);
        viewPager2.setAdapter(viewPageradapter);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bottomNavigationView.setSelectedItemId(R.id.menuHome);
                        break;
                    case 1:
                        bottomNavigationView.setSelectedItemId(R.id.menuTracker);
                        break;
                    case 2:
                        bottomNavigationView.setSelectedItemId(R.id.menuProfile);
                        break;
                }

                super.onPageSelected(position);
            }
        });
        bottomNavigationView = findViewById(R.id.bottoNavigation);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menuHome:
                        viewPager2.setCurrentItem(0);
                        break;
                    case R.id.menuTracker:
                        viewPager2.setCurrentItem(1);
                        break;
                    case R.id.menuProfile:
                        viewPager2.setCurrentItem(2);
                        break;
                }
                return true;
            }
        });
    }

}


