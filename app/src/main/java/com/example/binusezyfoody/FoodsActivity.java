package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodsActivity extends AppCompatActivity {
    RecyclerView food_recycle;
    Button Myorder;
    String s1[], s2[];
    int images[] ={R.drawable.bakso,R.drawable.mie,R.drawable.nasgor,R.drawable.soto};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

        food_recycle=findViewById(R.id.food_recycle);

        s1 = getResources().getStringArray(R.array.food);
        s2 = getResources().getStringArray(R.array.descriptionfood);

        MyAdapter myAdappter = new MyAdapter(this,s1,s2,images);
        food_recycle.setAdapter(myAdappter);
        food_recycle.setLayoutManager(new LinearLayoutManager(this));

        Myorder = findViewById(R.id.myOrder);

        Myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FoodsActivity.this,OrderActivity.class));
            }
        });

    }
}