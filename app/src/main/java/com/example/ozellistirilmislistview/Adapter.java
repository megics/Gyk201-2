package com.example.ozellistirilmislistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    ArrayList<Kullanici> liste; //veri kümesinin bulunduğu liste
    Context c; //contex değişkeni

    //constructor(obje oluşurken ilk çalışan kod)
    public Adapter(ArrayList<Kullanici> liste, Context c) {
        this.liste = liste;
        this.c = c;
    }

    @Override //listedeki eleman sayısını döndürür
    public int getCount() {
        return liste.size();
    }

    @Override //listede positiondaki elemanı geri döndürür
    public Object getItem(int position) {
        return liste.get(position);
    }

    @Override
    public long getItemId(int position) {
        return liste.get(position).hashCode();
    }

    @Override //xml i inflate ettiğimiz fonksiyon
    public View getView(int position, View convertView, ViewGroup parent) {
       View row =null; //fonksiyon sonunda döndürülen view değişkeni
       LayoutInflater inflater = (LayoutInflater) c. //inflate etmek için LayoutInflater objesi
               getSystemService(c.LAYOUT_INFLATER_SERVICE);
       if(convertView==null)
       {
           row = inflater.inflate(R.layout.kullanici_view,parent,false);//xmlin ifnlate edildiği satır
       }
       else
       {
           row=convertView;
       }

        TextView isim = row.findViewById(R.id.isim); //xmldeki TextView tanımlanması ve atanması
        isim.setText(liste.get(position).getIsim()); //Textviewdakit extin değerini gelen elemanın ismi ile değiştirir
       // TextView saat = row.findViewById(R.id.saat);
       // saat.setText(liste.get(position).getSaat());
        ImageView img = row.findViewById(R.id.imageView); //imageView tanımlaması ve atanması
        img.setBackgroundResource(R.mipmap.ic_launcher_round); //imageViewın içine yerleşecek olan fotoğraf burada ayarlanıyor
        return row;
    }
}
