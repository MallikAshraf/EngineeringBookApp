package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book7 extends AppCompatActivity {
    PDFView book7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book7);
        book7 = (PDFView)findViewById(R.id.pdf7);
        book7.fromAsset("cn.pdf").load();


    }
}
