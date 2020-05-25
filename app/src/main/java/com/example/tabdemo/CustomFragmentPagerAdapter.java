package com.example.tabdemo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CustomFragmentPagerAdapter extends FragmentStateAdapter {

    public CustomFragmentPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new PageFragment(position + 1);
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
