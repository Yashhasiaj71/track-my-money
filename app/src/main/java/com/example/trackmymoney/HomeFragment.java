package com.example.trackmymoney;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HomeFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        WaveView waveview = view.findViewById(R.id.waveview);


        // set persentage
        waveview.setPercentage(0.75f);


        Spinner myspinner = view.findViewById(R.id.changeexpenseviewbutton);
        String[] items = {"Today","5 Days"};
         ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item,items);
  myspinner.setAdapter(adapter);
         // Your calculated percentage (e.g., 75%)





    }
}

