package com.example.movietracker;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewPageradapter extends FragmentStateAdapter {
    ArrayList<Fragment> arr;
    public ViewPageradapter(@NonNull FragmentActivity fragmentActivity, ArrayList<Fragment> arr) {
        super(fragmentActivity);
        this.arr = arr;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return arr.get(position);
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }
}
