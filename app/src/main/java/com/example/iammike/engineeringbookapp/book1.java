package com.example.iammike.engineeringbookapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book1 extends AppCompatActivity {
    PDFView book1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
        book1 = (PDFView)findViewById(R.id.pdf1);
        book1.fromAsset("ctext.pdf").load();


    }
}
