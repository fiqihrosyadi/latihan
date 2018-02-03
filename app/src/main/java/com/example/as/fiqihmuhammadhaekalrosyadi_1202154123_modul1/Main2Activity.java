package com.example.as.fiqihmuhammadhaekalrosyadi_1202154123_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import android.content.Intent;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView porsi, tempat, nasi, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String HasilTempat = intent.getStringExtra("tempat");
        String HasilMenu = intent.getStringExtra("menu");
        String HasilJumlah = intent.getStringExtra("jumlah");
        String HasilHarga = intent.getStringExtra("Harga");

        int TotalHarga = Integer.valueOf(HasilHarga)*Integer.valueOf(HasilJumlah);

        tempat = (TextView)findViewById(R.id.textView4);
        tempat.setText(HasilTempat);

        nasi = (TextView)findViewById(R.id.textView9);
        nasi.setText(HasilMenu);

        porsi = (TextView)findViewById(R.id.textViewJumlah);
        porsi.setText(HasilJumlah);

        harga = (TextView)findViewById(R.id.textViewTotal);
        harga.setText(String.valueOf(TotalHarga));

        if (TotalHarga > 65000){
            Toast popup = Toast.makeText(this, R.string.eatbus_message,Toast.LENGTH_LONG);
            popup.show();
        } else {
            Toast popup = Toast.makeText(this, R.string.abnormal_message,Toast.LENGTH_LONG);
            popup.show();
        }
    }


}
