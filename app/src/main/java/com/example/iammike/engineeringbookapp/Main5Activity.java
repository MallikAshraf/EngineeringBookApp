package com.example.iammike.engineeringbookapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    private Button aaaa, bbbb , cccc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

       aaaa = findViewById(R.id.button5);
        bbbb = findViewById(R.id.button6);
        cccc = findViewById(R.id.button7);
        aaaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main5Activity.this, Main7Activity.class);
                startActivity(intent);
            }
        });

        bbbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
                startActivity(intent);
            }
        });
        cccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main5Activity.this, Main9Activity.class);
                startActivity(intent);
            }
        });

    }

}