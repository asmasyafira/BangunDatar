package com.example.safuan.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegipanjang extends AppCompatActivity {

    Button btn;
    EditText input;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        btn = findViewById(R.id.btnhitungpp);
        input = findViewById(R.id.etpanjang);
        input = findViewById(R.id.etlebar);
        txthasil = findViewById(R.id.txtPanjang);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float panjang = Float.parseFloat(input.getText().toString());
                float lebar = Float.parseFloat(input.getText().toString());
                float hasil = panjang * lebar;
                txthasil.setText(hasil + "");
            }
        });
    }
}