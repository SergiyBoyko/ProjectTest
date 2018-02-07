package com.example.serhii.ubrainianstest.ui.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.serhii.ubrainianstest.R;

/**
 * Created by Serhii on 07.02.2018.
 */

public class PanoramaImageFragment extends android.support.v4.app.Fragment {
    public static PanoramaImageFragment newInstance() {
        return new PanoramaImageFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_panorama, container, false);
    }
}
