package com.kardelenapp.fizikformulleri;

/**
 * Created by mustafa on 11/14/2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class VektorlerOzelFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.vektorler_ozel, null);
        return v;
    }
}