package com.example.trackmymoney;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

   public View OnCreateView(LayoutInflater inflator , ViewGroup container,Bundle SavedInstanceState){
       return inflator.inflate(R.layout.fragment_profile,container,false);
   }
}