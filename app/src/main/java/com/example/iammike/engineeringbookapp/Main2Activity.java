package com.example.iammike.engineeringbookapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button aa,bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        aa = findViewById(R.id.button1);
        bb = findViewById(R.id.button2);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder f = new AlertDialog.Builder(Main2Activity.this);


                f.setTitle(R.string.title);
                f.setMessage(R.string.msg);
                f.setCancelable(false);

                f.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();

                    }
                });

                f.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();

                    }
                });

                AlertDialog g =f.create();
                g.show();
            }
        });


    }


    @Override
    public void onBackPressed() {

        AlertDialog.Builder f = new AlertDialog.Builder(Main2Activity.this);


        f.setTitle(R.string.title);
        f.setMessage(R.string.msg);
        f.setCancelable(false);

        f.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });

        f.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();

            }
        });

        AlertDialog g =f.create();
        g.show();

    }

}
