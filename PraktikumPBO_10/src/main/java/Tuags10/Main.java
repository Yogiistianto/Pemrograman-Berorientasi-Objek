/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuags10;

/**
 *
 * @author HP
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik dan Makanan
        Pembayaran laptop = new Elektronik();
        Pembayaran roti = new Makanan();

        // Menentukan harga
        double hargaLaptop = 5000000; // Rp 5.000.000
        double hargaRoti = 20000;     // Rp 20.000

        // Menghitung pajak
        double pajakLaptop = laptop.hitungPajak(hargaLaptop);
        double pajakRoti = roti.hitungPajak(hargaRoti);

        // Menampilkan hasil
        System.out.println("Sistem Pembayaran Toko");
        System.out.println("Produk: Elektronik (Laptop)");
        System.out.println("Harga: Rp " + hargaLaptop);
        System.out.println("Pajak (10%): Rp " + pajakLaptop);
        System.out.println("------------------------------");
        System.out.println("Produk: Makanan (Roti)");
        System.out.println("Harga: Rp " + hargaRoti);
        System.out.println("Pajak (5%): Rp " + pajakRoti);
    }
}
