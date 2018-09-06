package com.example.iammike.engineeringbookapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity {
    private ListView list;
    String[] abc;
    private int[] zxc = {R.drawable.e,R.drawable.e,R.drawable.e};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        list = (ListView) findViewById(R.id.list );
        abc = getResources().getStringArray(R.array.zzz);

        CustomAdapter cs = new CustomAdapter(this,abc,zxc);
        list.setAdapter(cs);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = abc[position];

                if(value == abc[0])
                {
                    Intent i = new Intent(Main9Activity.this,book7.class);
                    startActivity(i);
                }
                if(value == abc[1])
                {
                    Intent i = new Intent(Main9Activity.this,book8.class);
                    startActivity(i);
                }if(value == abc[2])
                {
                    Intent i = new Intent(Main9Activity.this,book9.class);
                    startActivity(i);
                }


            }
        });


    }
}
