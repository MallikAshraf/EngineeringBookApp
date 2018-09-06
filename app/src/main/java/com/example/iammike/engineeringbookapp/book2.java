package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book2 extends AppCompatActivity {
    PDFView book2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);
        book2 = (PDFView)findViewById(R.id.pdf2);
        book2.fromAsset("thecbook.pdf").load();


    }
}
