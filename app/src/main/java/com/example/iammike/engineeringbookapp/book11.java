package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book11 extends AppCompatActivity {
    PDFView book11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book11);
        book11 = (PDFView)findViewById(R.id.pdf11);
        book11.fromAsset("fundeee.pdf").load();


    }
}