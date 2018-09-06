package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book6 extends AppCompatActivity {
    PDFView book1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book6);
        book1 = (PDFView)findViewById(R.id.pdf6);
        book1.fromAsset("tutopoin.pdf").load();


    }
}
