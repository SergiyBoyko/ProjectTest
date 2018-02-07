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

public class GeoNamesFragment extends android.support.v4.app.Fragment {
    public static GeoNamesFragment newInstance() {
        return new GeoNamesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_geo_names, container, false);
    }
}
