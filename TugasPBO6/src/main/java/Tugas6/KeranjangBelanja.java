/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.List;

// Kelas KeranjangBelanja
class KeranjangBelanja {
    List<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p); // Polymorphism: bisa simpan Buku, Elektronik, Pakaian
    }

    public void tampilkanProduk() {
        for (Produk p : daftarProduk) {
            // Polymorphism: p.tampilkanInfo() menyesuaikan subclass
            p.tampilkanInfo();
        }
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon(); // polymorphic call
        }
        return total;
    }
}
