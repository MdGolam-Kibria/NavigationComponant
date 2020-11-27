package com.example.navigationcomponant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class Two extends Fragment {
    TextView click2;
    ImageButton imageButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        click2 = view.findViewById(R.id.setTv);
        imageButton = view.findViewById(R.id.backBtn);
        String data = getArguments().getString("data");
        click2.setText(data);
        click2.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_two_to_one);
        });
        imageButton.setOnClickListener(view12 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_two_to_one);
        });
        return view;
    }
}