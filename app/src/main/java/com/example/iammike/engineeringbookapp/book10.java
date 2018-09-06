package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book10 extends AppCompatActivity {
    PDFView book10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book10);
        book10 = (PDFView)findViewById(R.id.pdf10);
        book10.fromAsset("eeep.pdf").load();


    }
}
