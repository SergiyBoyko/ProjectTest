package com.example.serhii.ubrainianstest.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.serhii.ubrainianstest.R;

/**
 * Created by Serhii on 07.02.2018.
 */

public class ZipImageFragment extends android.support.v4.app.Fragment {
    public static ZipImageFragment newInstance() {
        return new ZipImageFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_zip_image, container, false);
    }
}
