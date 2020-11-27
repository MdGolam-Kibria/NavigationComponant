package com.example.navigationcomponant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class One extends Fragment {
    Button click;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        click = view.findViewById(R.id.click);
        click.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putString("data", "wow");
            Navigation.findNavController(getView()).navigate(R.id.action_one_to_two, bundle);
        });
        return view;
    }
}