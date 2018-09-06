package com.example.iammike.engineeringbookapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main10Activity extends AppCompatActivity {
    private Button aaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        aaa = findViewById(R.id.button51);
        aaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main10Activity.this, Main11Activity.class);
                startActivity(intent);
            }
        });



    }

}