package com.example.apk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.nio.file.OpenOption;

public class getstarter extends AppCompatActivity {
    ImageView Gambargif, img;
    RelativeLayout r1;
    ImageButton genap, banding, kerucut, kpk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarter);
        img = findViewById(R.id.we);
        r1 = findViewById(R.id.r1);


        genap = findViewById(R.id.gengan);
        banding = findViewById(R.id.banding);
        kerucut = findViewById(R.id.kerucut);
        kpk = findViewById(R.id.kpkfpb);


        genap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getstarter.this, spalash.class);
                startActivity(a);
            }
        });

        banding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getstarter.this, nex.class);
                startActivity(b);
            }
        });
        kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getstarter.this, nex2.class);
                startActivity(c);
            }
        });
        kpk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(getstarter.this, fpbkpk.class);
                startActivity(d);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
//

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.txt1:
                startActivity(new Intent(getApplicationContext(), Biodata.class));
                break;

            case R.id.txt2:
                startActivity(new Intent(getApplicationContext(), hal1.class));
                break;
        }
        return true;
    }

}







