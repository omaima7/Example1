package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println("branch1 team2");

        System.out.println("branch1 from team1");

        System.out.println("branch1 from team3");

        System.out.println("line 2 in team2");

        System.out.println("line 3 in team2");



        System.out.println("line x in team1");

    }
}