package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class spalash extends AppCompatActivity {
    ImageButton tombol1,next1;
    EditText edit1;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalash);


        tombol1 = findViewById(R.id.tmbl1);
        edit1 = (EditText)findViewById(R.id.edit1);
        Hasil = findViewById(R.id.ouptput);
        next1 =  findViewById(R.id.next1);

        final String genao = "angka ini genap";

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String hasil = edit1.getText().toString();

                if (!TextUtils.isEmpty(hasil)) {

                    int nilai = Integer.parseInt(hasil);

                    if (nilai % 2 == 0) {

                        Hasil.setText(genao);

                        Toast.makeText(getApplicationContext(), "Genap", Toast.LENGTH_LONG).show();
//                } else if (nilai >= 80) {
//                    Toast.makeText(getApplicationContext(), "Lumayan", Toast.LENGTH_LONG).show();

                    } else

                        Hasil.setText("Ini angka ganjil");
                    Toast.makeText(getApplicationContext(), "ganjil", Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(spalash.this, "Maaf, nilai tidak boleh kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });



        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(spalash.this,getstarter.class);
                startActivity(i);
            }
        });
    }
}
