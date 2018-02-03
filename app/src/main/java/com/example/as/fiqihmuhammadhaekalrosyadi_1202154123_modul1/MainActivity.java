package com.example.as.fiqihmuhammadhaekalrosyadi_1202154123_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText edMenu, edJumlah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        edMenu = (EditText)findViewById(R.id.editTextMenu);
        String makan = edMenu.getText().toString();

        edJumlah = (EditText)findViewById(R.id.editTextJumlah);
        String porsi = edJumlah.getText().toString();

        intent.putExtra("tempat","EATBUS");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", porsi);
        intent.putExtra("Harga", "50000");
        startActivity(intent);
    }

    public void abnormal(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        edMenu = (EditText)findViewById(R.id.editTextMenu);
        String makan = edMenu.getText().toString();

        edJumlah = (EditText)findViewById(R.id.editTextJumlah);
        String porsi = edJumlah.getText().toString();

        intent.putExtra("tempat","ABNORMAL");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", porsi);
        intent.putExtra("Harga", "30000");
        startActivity(intent);
    }

}
