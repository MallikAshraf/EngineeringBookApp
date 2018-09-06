package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book9 extends AppCompatActivity {
    PDFView book9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book9);
        book9 = (PDFView)findViewById(R.id.pdf9);
        book9.fromAsset("cnp.pdf").load();


    }
}
