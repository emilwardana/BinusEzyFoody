package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrinksActivity extends AppCompatActivity {
    RecyclerView drink_recycle;
    Button Myorder;
    String[] s1;
    String[] s2;
    int[] images ={R.drawable.airmineral,R.drawable.jusalpukat,R.drawable.jusmangga,R.drawable.jusapel};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        drink_recycle=findViewById(R.id.drink_recycle);

        s1 = getResources().getStringArray(R.array.drinks);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdappter = new MyAdapter(this,s1,s2,images);
        drink_recycle.setAdapter(myAdappter);
        drink_recycle.setLayoutManager(new LinearLayoutManager(this));

       Myorder = findViewById(R.id.myOrder);

        Myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DrinksActivity.this,OrderActivity.class));
            }
        });

        }
    }
