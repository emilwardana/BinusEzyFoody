package com.example.binusezyfoody;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    CardView drinks;
    CardView snacks;
    CardView foods;
    CardView topup;
    CardView location;
    Button myOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinks = findViewById(R.id.drinks);
        snacks = findViewById(R.id.snacks);
        foods = findViewById(R.id.foods);
        topup = findViewById(R.id.topup);
        myOrder = findViewById(R.id.myorder);
        location = findViewById(R.id.location);

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(MainActivity.this,DrinksActivity.class));
            }
        });
        snacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SnacksActivity.class));
            }
        });
        foods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FoodsActivity.class));
            }
        });
        topup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,TopupActivity.class));
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NearbyRestaurant.class));
            }
        });

        myOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
            }
        });

//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        Val navController = findNavContolller(R.id.fragment);

    }
}