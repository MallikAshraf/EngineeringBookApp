package com.example.iammike.engineeringbookapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main11Activity extends AppCompatActivity {
    private ListView list;
    String[] abc;
    private int[] zxc = {R.drawable.f,R.drawable.f};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        list = (ListView) findViewById(R.id.list );
        abc = getResources().getStringArray(R.array.eee);

        CustomAdapter cs = new CustomAdapter(this,abc,zxc);
        list.setAdapter(cs);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = abc[position];

                if(value == abc[0])
                {
                    Intent i = new Intent(Main11Activity.this,book10.class);
                    startActivity(i);
                }
                if(value == abc[1])
                {
                    Intent i = new Intent(Main11Activity.this,book11.class);
                    startActivity(i);
                }


            }
        });


    }
}
