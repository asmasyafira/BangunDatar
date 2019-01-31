package com.example.safuan.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {

    Button btn;
    EditText input;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        btn = findViewById(R.id.btnPersegi);
        input = findViewById(R.id.etpersegi);
        txthasil = findViewById(R.id.txtPersegi);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sisi = Float.parseFloat(input.getText().toString());
                float hasil = sisi * sisi;
                txthasil.setText(hasil + "");
            }
        });
    }
}
