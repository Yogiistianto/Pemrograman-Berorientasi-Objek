/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas11;

/**
 *
 * @author HP
 */
public class Buku {
    // Atribut
    private String judul;
    
    // AGREGASI: Menyimpan referensi ke objek Pengarang
    private Pengarang pengarang;

    /**
     * Constructor Buku.
     * Menerima referensi objek Pengarang yang sudah dibuat di luar.
     */
    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang; // Menyimpan referensi (Agregasi)
    }

    // Metode
    public void infoBuku() {
        // Memanggil metode dari objek Pengarang yang disimpan
        System.out.println("  - Judul: " + this.judul + ", " + this.pengarang.infoPengarang());
    }
}
