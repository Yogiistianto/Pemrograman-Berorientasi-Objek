/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Perpustakaan {
    // Atribut
    private String namaPerpustakaan;
    
    // KOMPOSISI: Perpustakaan memiliki daftar Buku.
    // Jika Perpustakaan dihapus, List ini dan objek Buku di dalamnya
    // (jika tidak ada referensi lain) akan ikut terhapus oleh Garbage Collector.
    private List<Buku> daftarBuku;

    // Constructor
    public Perpustakaan(String nama) {
        this.namaPerpustakaan = nama;
        // Inisialisasi daftar buku (bagian dari Komposisi)
        this.daftarBuku = new ArrayList<>();
        System.out.println("\nPerpustakaan '" + this.namaPerpustakaan + "' telah dibuka.");
    }

    /**
     * Metode untuk menambahkan buku (Titik KOMPOSISI)
     */
    public void tambahBuku(String judul, Pengarang pengarang) {
        // KOMPOSISI:
        // Objek Perpustakaan *membuat* (menginstansiasi) objek Buku.
        // Objek Buku ini 'dimiliki' secara eksklusif oleh Perpustakaan.
        Buku bukuBaru = new Buku(judul, pengarang);
        
        // Menambahkan buku baru ke daftar milik perpustakaan
        this.daftarBuku.add(bukuBaru);
        System.out.println("-> Buku '" + judul + "' ditambahkan ke " + this.namaPerpustakaan);
    }

    /**
     * Metode untuk menampilkan semua buku
     */
    public void tampilkanSemuaBuku() {
        System.out.println("\nDaftar Buku di " + this.namaPerpustakaan + ":");
        if (this.daftarBuku.isEmpty()) {
            System.out.println("  (Perpustakaan masih kosong)");
            return;
        }
        
        // Loop melalui setiap objek Buku dan panggil metodenya
        for (Buku buku : this.daftarBuku) {
            buku.infoBuku();
        }
    }
}