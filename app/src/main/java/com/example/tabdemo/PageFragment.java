package com.example.tabdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {

    private int page;

    public PageFragment(int page) {
        super(R.layout.fragment_page);
        this.page = page;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView pageTV = view.findViewById(R.id.tvPage);
        pageTV.setText("Fragment #" + page);
    }
}
