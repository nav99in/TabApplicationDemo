package com.example.tabapplicationdemo.ui.fractivitydemo;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabapplicationdemo.R;

public class FrActivityDemoFragment extends Fragment {

    private FrActivityDemoViewModel mViewModel;

    public static FrActivityDemoFragment newInstance() {
        return new FrActivityDemoFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fr_activity_demo_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FrActivityDemoViewModel.class);
        // TODO: Use the ViewModel
    }

}
