package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class fpbkpk extends AppCompatActivity {

    ImageButton back, hasilcek;
    EditText editkpk, editkpk1;
    TextView textkpk, textfpb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpbkpk);

        back = findViewById(R.id.backkpk);
        hasilcek = findViewById(R.id.cekkpk);
        editkpk = findViewById(R.id.nilaikpk);
        editkpk1 = findViewById(R.id.nilaikpk1);
        textkpk = findViewById(R.id.hasilkpk);
        textfpb = findViewById(R.id.hasilfpb);

        hasilcek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = editkpk.getText().toString();
                String angka2 = editkpk1.getText().toString();


                if (!TextUtils.isEmpty(angka1)) {
                    if (!TextUtils.isEmpty(angka2)) {
                        int a = Integer.parseInt(angka1);
                        int b = Integer.parseInt(angka2);
                        int c = 0;


                        for (int x = 1; x <= b; x++) {

                            c = (c + a);

                            if (c % b == 0) {

                                textkpk.setText(String.valueOf(c));


                            }
                        }

                        int d;

                        d = a % b;


                        while (d != 0) {

                            a = b;

                            b = d;

                            d = a % b;
                        }

                        textfpb.setText(String.valueOf(b));
                    }
                }


            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(fpbkpk.this, getstarter.class);
                startActivity(a);
            }
        });


    }
}
