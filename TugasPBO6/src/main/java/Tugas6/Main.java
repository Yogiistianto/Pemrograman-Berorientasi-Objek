/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author HP
 */
// Class Main
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Polymorphism: semua bertipe Produk, tapi objeknya berbeda
        Produk p1 = new Buku("Pemrograman Java", 100000);
        Produk p2 = new Elektronik("Smartphone", 3000000);
        Produk p3 = new Pakaian("Kaos Polos", 150000);

        keranjang.tambahProduk(p1);
        keranjang.tambahProduk(p2);
        keranjang.tambahProduk(p3);

        // Tampilkan info semua produk
        keranjang.tampilkanProduk();

        // Hitung total belanja setelah diskon
        System.out.println("Total Belanja Setelah Diskon: Rp" + keranjang.hitungTotal());
    }
}
