package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book5 extends AppCompatActivity {
    PDFView book5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book5);
        book5 = (PDFView)findViewById(R.id.pdf5);
        book5.fromAsset("teachurself.pdf").load();


    }
}
