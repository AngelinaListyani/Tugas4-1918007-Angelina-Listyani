package com.example.tugas4_recycleview;

public class Sosmed {
    private  String nama,isi;
    private int gambar;
    public Sosmed (String nama,String isi,int gambar){
        this.nama = nama;
        this.isi = isi;
        this.gambar = gambar;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }public String getIsi(){
        return isi;
    }
    public void setIsi(String isi){
        this.isi= isi;
    }
    public int getGambar(){
        return gambar;
    }
    public void setGambar(int gambar){
        this.gambar = gambar;
    }
}
