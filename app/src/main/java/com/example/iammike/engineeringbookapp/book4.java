package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book4 extends AppCompatActivity {
    PDFView book4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book4);
        book4 = (PDFView)findViewById(R.id.pdf4);
        book4.fromAsset("itpjava.pdf").load();


    }
}
