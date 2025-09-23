/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author HP
 */

abstract class Produk {
    String nama;
    double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Metode abstrak
    public abstract double hitungDiskon();

    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Diskon: Rp" + hitungDiskon());
        System.out.println("Harga Setelah Diskon: Rp" + getHargaSetelahDiskon());
        System.out.println("--------------------------------");
    }
}

// Subclass Buku
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 10%
        return harga * 0.10;
    }
}

// Subclass Elektronik
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 5%
        return harga * 0.05;
    }
}

// Subclass Pakaian
class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 20%
        return harga * 0.20;
    }
}