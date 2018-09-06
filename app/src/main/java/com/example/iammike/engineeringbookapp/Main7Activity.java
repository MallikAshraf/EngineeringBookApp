package com.example.iammike.engineeringbookapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {
    private ListView list;
    String[] abc;
    private int[] zxc = {R.drawable.p,R.drawable.p,R.drawable.p};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        list = (ListView) findViewById(R.id.list );
        abc = getResources().getStringArray(R.array.abc);

        CustomAdapter cs = new CustomAdapter(this,abc,zxc);
        list.setAdapter(cs);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = abc[position];

                if(value == abc[0])
                {
                    Intent i = new Intent(Main7Activity.this,book1.class);
                    startActivity(i);
                }
                if(value == abc[1])
                {
                    Intent i = new Intent(Main7Activity.this,book2.class);
                    startActivity(i);
                }if(value == abc[2])
                {
                    Intent i = new Intent(Main7Activity.this,book3.class);
                    startActivity(i);
                }


            }
        });


    }
}
