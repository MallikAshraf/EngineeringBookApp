package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book8 extends AppCompatActivity {
    PDFView book8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book8);
        book8 = (PDFView)findViewById(R.id.pdf8);
        book8.fromAsset("nf.pdf").load();


    }
}
