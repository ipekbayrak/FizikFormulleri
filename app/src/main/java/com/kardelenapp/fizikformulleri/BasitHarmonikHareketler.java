package com.kardelenapp.fizikformulleri;

/**
 * Created by mustafa on 11/14/2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BasitHarmonikHareketler extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.basit_harmonik_hareket, null);
        return v;
    }
}