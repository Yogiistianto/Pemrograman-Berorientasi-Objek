/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas11;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Membuat Objek Pengarang (Agregasi) ---");
        // 1. Objek Pengarang dibuat secara independen.
        //    Siklus hidup mereka tidak bergantung pada Perpustakaan atau Buku.
        Pengarang penulis1 = new Pengarang("Tere Liye");
        Pengarang penulis2 = new Pengarang("Andrea Hirata");

        System.out.println("\n--- Membuat Objek Perpustakaan dan Menambah Buku (Komposisi) ---");
        // 2. Membuat objek Perpustakaan.
        Perpustakaan perpusNasional = new Perpustakaan("Perpustakaan Nasional");

        // 3. Perpustakaan *membuat* objek Buku (Komposisi)
        //    Kita 'memasukkan' referensi Pengarang (Agregasi) saat membuat Buku.
        perpusNasional.tambahBuku("Bumi", penulis1);
        perpusNasional.tambahBuku("Laskar Pelangi", penulis2);
        perpusNasional.tambahBuku("Bulan", penulis1);

        // 4. Menampilkan semua buku yang 'dimiliki' perpustakaan.
        perpusNasional.tampilkanSemuaBuku();

        System.out.println("\n--- Demonstrasi Komposisi vs Agregasi ---");
        
        // 5. Menghapus referensi ke objek Perpustakaan.
        //    Di Java, ini berarti objek tsb memenuhi syarat untuk Garbage Collection (GC).
        System.out.println("Menghapus referensi ke 'perpusNasional'...");
        perpusNasional = null; 
        
        // Meminta GC berjalan (hanya saran, tidak dijamin)
        System.gc(); 
        
        System.out.println("-> Objek 'perpusNasional' dan semua objek 'Buku' di dalamnya (Komposisi)");
        System.out.println("   sekarang memenuhi syarat untuk dihapus oleh Garbage Collector.");


        // 6. Memeriksa apakah objek Pengarang (Agregasi) masih ada.
        System.out.println("\nMemeriksa status objek Pengarang setelah Perpustakaan dihapus:");
        try {
            // Ini akan BERHASIL karena Pengarang adalah Agregasi.
            System.out.println("Objek '" + penulis1.getNamaPengarang() + "' masih ada.");
            System.out.println("Objek '" + penulis2.getNamaPengarang() + "' masih ada.");
        } catch (NullPointerException e) {
            System.out.println("Objek Pengarang telah terhapus.");
        }
    }
}