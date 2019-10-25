package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class nex extends AppCompatActivity {
    EditText cek1, cek2;
    ImageButton tmbl2, nex2;
    TextView hasilnex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nex);

        cek1 = (EditText) findViewById(R.id.cek1);
        cek2 = (EditText) findViewById(R.id.cek2);
        tmbl2 = findViewById(R.id.tbl2);
        nex2 = findViewById(R.id.back);
        hasilnex = findViewById(R.id.hasilnex);

        tmbl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = cek1.getText().toString();
                String nilai2 = cek2.getText().toString();

                if (!TextUtils.isEmpty(nilai)) {


                    if (!TextUtils.isEmpty(nilai2)) {

                        int angka1 = Integer.parseInt(nilai);
                        int angka2 = Integer.parseInt(nilai2);


                        if (angka1 > angka2) {
                            hasilnex.setText("Angka pertam lebih besar dari angka kedua");
                            Toast.makeText(getApplicationContext(), "Angkapertama lebih besat dari kedua", Toast.LENGTH_LONG).show();
                        } else if (angka1 < angka2) {
                            hasilnex.setText("Anka kedua lebih besar dari angka pertama");
                            Toast.makeText(getApplicationContext(), "Angkakedua lebih besar dari pertama", Toast.LENGTH_LONG).show();
                        } else {
                            hasilnex.setText("Kedua angka sama sama besar");
                            Toast.makeText(getApplicationContext(), "Sama sama besar", Toast.LENGTH_LONG).show();

                        }
                    } else {
                        Toast.makeText(getApplicationContext(),"masukan angka please", Toast.LENGTH_LONG).show();
                    }


                    }else {
                    Toast.makeText(getApplicationContext(),"masukan angka please",Toast.LENGTH_LONG).show();


                }


            }
        });

        nex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(nex.this, com.example.apk.getstarter.class);
                startActivity(n);
            }
        });
    }
}
