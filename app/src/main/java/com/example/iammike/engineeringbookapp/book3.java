package com.example.iammike.engineeringbookapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book3 extends AppCompatActivity {
    PDFView book3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);
        book3 = (PDFView)findViewById(R.id.pdf3);
        book3.fromAsset("tutorial.pdf").load();


    }
}
