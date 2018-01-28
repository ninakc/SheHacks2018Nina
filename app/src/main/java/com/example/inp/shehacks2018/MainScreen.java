package com.example.inp.shehacks2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        final Button sign_up = findViewById(R.id.ms_sign_up);
        sign_up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, SignUpOptions.class);
                startActivity(i);
            }
        });

        final Button log_in = findViewById(R.id.ms_login);
        log_in.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, LogIn.class);
                startActivity(i);
            }
        });


    }
}
