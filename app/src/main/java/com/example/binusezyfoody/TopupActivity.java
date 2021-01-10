package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class TopupActivity extends AppCompatActivity {
    TextInputLayout kirimSaldo;
    String saldoAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup);
        TextView JumlahlSaldo = (TextView) findViewById(R.id.saldoView);
        kirimSaldo= (TextInputLayout) findViewById((R.id.setSaldo));
       // saldoAmount = kirimSaldo.getEditText().getText();
        Button btn = (Button) findViewById(R.id.topupBtn);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //JumlahlSaldo.setText(kirimSaldo.get);
//            }
//        });





    }
}