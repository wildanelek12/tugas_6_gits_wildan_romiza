package com.codes.tugas_6_gits_wildan_romiza.Model;

public class Makanan {
    String nama,harga,gambar;

    public Makanan(String nama, String harga, String gambar) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getGambar() {
        return gambar;
    }
}
