package com.example.iammike.engineeringbookapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] abc;
    int[] zxc;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context,String[] abc,int[] zxc){
        this.context = context;
        this.abc = abc;
        this.zxc = zxc;

    }



    @Override
    public int getCount() {
        return abc.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample,parent,false);

        }
        ImageView img = (ImageView) convertView.findViewById(R.id.img);
        TextView txt = (TextView) convertView.findViewById(R.id.text1);

        img.setImageResource(zxc[position]);
        txt.setText(abc[position]);
        return convertView;

    }
}
