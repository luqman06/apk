package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    /*ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_main);
       new Handler().postDelayed(new )
        //logo
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luq = new Intent(MainActivity.this,getstarter.class);
                startActivity(luq);
                finish();

            }
        });



    }
}*/
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {



                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, getstarter.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
