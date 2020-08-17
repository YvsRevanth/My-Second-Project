package com.example.master;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class NewLife1 extends Fragment {
    Reaction reaction;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_new_life1, container, false);
        return view;
    }
    //SET THE INTERFACE IN FRAGMENT LIKE THIS
    //CALL THIS FROM ACTIVITY
    public void setReaction(Reaction reaction){
        this.reaction = reaction;
    }

    @Override
    public void onResume() {
        super.onResume();
        Button button = view.findViewById(R.id.tinku);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public interface Reaction{
        public void color();
    }
    }


