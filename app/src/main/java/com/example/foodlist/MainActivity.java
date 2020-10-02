package com.example.foodlist;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    RecyclerView recyclerView;
////    Adapter adapter;
////    ArrayList<String> items;
    private static int SPLASH_TIME_OUT = 2500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
        }

//        items = new ArrayList<>();
//        items.add("First CardView Item");
//        items.add("Second CardView Item");
//        items.add("Third CardView Item");
//        items.add("Fourth CardView Item");
//        items.add("Fifth CardView Item");
//        items.add("Sixth CardView Item");
//        items.add("1 CardView Item");
//        items.add("2 CardView Item");
//        items.add("3 CardView Item");
//
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        adapter = new Adapter(this,items);
//        recyclerView.setAdapter(adapter);




    }

