package com.example.ozellistirilmislistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.ozellist); //ListViewın tanımlanması
        ArrayList<Kullanici> veriListesi = new ArrayList<>(); // Kullanıcıların tutulduğu veri kümesi
        Kullanici k = new Kullanici("Sumru","13:10:15");//Kullanıcı objesinin oluşturulması
        veriListesi.add(k); //listeye eklenmesi
        k = new Kullanici("Burcu","10:22:10");
        veriListesi.add(k);
        Adapter a = new Adapter(veriListesi,getBaseContext()); //adapterın oluşturulması
        final ArrayList<Gazete> gazeteVeriListesi = new ArrayList<>(); //Gazete tipinde elemanları tutacak olan veriKümesi
        Gazete g = new Gazete("Posta","https://www.posta.com.tr/"); //Gazete objesinin oluşturulması
        gazeteVeriListesi.add(g); //Verikümesine objenin eklenmesi
        g = new Gazete("Sözcü","https://www.sozcu.com.tr/");
        gazeteVeriListesi.add(g);
        g= new Gazete("X gazetesi","https://gelecegiyazanlar.turkcell.com.tr/");
        gazeteVeriListesi.add(g);
        GazeteAdapter ga = new GazeteAdapter(gazeteVeriListesi,getBaseContext());//GazeteAdapterın tanımlanması
        list.setAdapter(ga);//adapter ile beraber verikümes,ndeki elemanlar listviewın içine yerleştirilir
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) { //listedeki itemin tıklanıp tıklanılmadığını kontrol eder
                Intent i = new Intent(getBaseContext(),WebViewActivity.class). //Main ACtivityden Webview Activitye geçiş sağlar ve geçişte url bilgisini de beraberinde iletir
                        putExtra("<StringName>",gazeteVeriListesi.get(position).getUrl());
                startActivity(i); //geçiş işlemini başlatır
            }
        });




    }
}
