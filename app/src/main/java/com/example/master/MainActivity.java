package com.example.master;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements NewLife1.Reaction {
    NewLife1 newLife1 = new NewLife1();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportFragmentManager().beginTransaction().add(R.id.tinku, newLife1).commit();
        //Dont Forget this line
        newLife1.setReaction(this);
    }

    @Override
    public void color() {

    }
}