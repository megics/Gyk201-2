package com.example.ozellistirilmislistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GazeteAdapter extends BaseAdapter {

    ArrayList<Gazete> veriListesi;
    Context c;

    public GazeteAdapter(ArrayList<Gazete> veriListesi, Context c) {
        this.veriListesi = veriListesi;
        this.c = c;
    }

    @Override
    public int getCount() {
        return veriListesi.size();
    }

    @Override
    public Object getItem(int position) {
        return veriListesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return veriListesi.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row =null;
        LayoutInflater inflater = (LayoutInflater) c.
                getSystemService(c.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
        {
            row = inflater.
                    inflate(R.layout.kullanici_view,parent,false);
        }
        else
        {
            row =convertView;
        }
        TextView isim = row.findViewById(R.id.isim);
        isim.setText(veriListesi.get(position).getGazeteİsmi());
        ImageView img = row.findViewById(R.id.imageView);

        switch (veriListesi.get(position).getGazeteİsmi())
        {
            case "Posta":
                img.setBackgroundResource(R.drawable.posta);
                break;
            case "Sözcü":
                img.setBackgroundResource(R.drawable.sozcu);
                break;
            default:
                img.setBackgroundResource(R.mipmap.ic_launcher_round);
                break;
        }
        return row;
    }
}
