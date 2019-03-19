package com.example.ozellistirilmislistview;

public class Kullanici {

   private String isim;
   private String saat;

    public Kullanici(String isim, String saat) {
        this.isim = isim;
        this.saat = saat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }
}
