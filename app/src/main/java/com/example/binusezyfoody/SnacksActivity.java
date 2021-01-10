package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SnacksActivity extends AppCompatActivity {
    RecyclerView snacks_recycle;
    Button Myorder;
    String[] s1;
    String[] s2;
    int[] images ={R.drawable.bakwan,R.drawable.tempe,R.drawable.lumpia,R.drawable.popcorn,R.drawable.lemper};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
        snacks_recycle=findViewById(R.id.snacks_recycle);

        s1 = getResources().getStringArray(R.array.snacks);
        s2 = getResources().getStringArray(R.array.descriptionsnacks);

        MyAdapter myAdappter = new MyAdapter(this,s1,s2,images);
        snacks_recycle.setAdapter(myAdappter);
        snacks_recycle.setLayoutManager(new LinearLayoutManager(this));

        Myorder = findViewById(R.id.myOrder);

        Myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SnacksActivity.this,OrderActivity.class));
            }
        });
    }
}