package com.example.trackmymoney;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

// Also import your adapter and model if needed
import com.example.trackmymoney.CategoryAdapter;
import com.example.trackmymoney.CategoryItem;



public class AddFragment extends Fragment {

   public View onCreateView(LayoutInflater inflater , ViewGroup container,Bundle savedInstanceState){
       View view = inflater.inflate(R.layout.fragment_add,container,false);

       Spinner spinner = view.findViewById(R.id.spinner);

       List<CategoryItem> categoryList = new ArrayList<>();
       categoryList.add(new CategoryItem("Select Category", R.drawable.baseline_keyboard_arrow_down_24));
       categoryList.add(new CategoryItem("Food", R.drawable.utensils_solid));
       categoryList.add(new CategoryItem("Travel", R.drawable.plane_solid));
       categoryList.add(new CategoryItem("Shopping", R.drawable.bag_shopping_solid));
       categoryList.add(new CategoryItem("other",R.drawable.plus_solid));

       CategoryAdapter adapter = new CategoryAdapter(requireContext(), categoryList);
       spinner.setAdapter(adapter);

       return view;
   }
}