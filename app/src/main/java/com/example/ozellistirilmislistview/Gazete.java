package com.example.ozellistirilmislistview;

public class Gazete {

    //gazete classının attributeleri
    private String gazeteİsmi;
    private String url;

    //constructor
    public Gazete(String gazeteİsmi, String url) {
        this.gazeteİsmi = gazeteİsmi;
        this.url = url;
    }

    //get fonksiyonları private değişkenlere diğer classlardan ulaşmamızı sağlar
    //set fonksiyonları ise değişkenlerin değerini değiştirmeye yarar.
    public String getGazeteİsmi() {
        return gazeteİsmi;
    }

    public void setGazeteİsmi(String gazeteİsmi) {
        this.gazeteİsmi = gazeteİsmi;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
