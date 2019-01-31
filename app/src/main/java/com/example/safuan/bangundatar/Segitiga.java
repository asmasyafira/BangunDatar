package com.example.safuan.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    Button btn;
    EditText input;
    TextView txthasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        btn = findViewById(R.id.btnSegitiga);
        input = findViewById(R.id.etalas);
        input = findViewById(R.id.ettinggi);
        txthasil = findViewById(R.id.txtSegitiga);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float alas = Float.parseFloat(input.getText().toString());
                float tinggi = Float.parseFloat(input.getText().toString());
                float hasil = (alas * tinggi)/2 ;
                txthasil.setText(hasil + "");
            }
        });
    }
    }

