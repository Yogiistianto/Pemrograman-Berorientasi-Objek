/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek pekerja
        Pekerja p1 = new Pekerja("Budi", 25, "Programmer", 7500000);

        // Menampilkan informasi awal
        System.out.println("=== Informasi Pekerja ===");
        System.out.println(p1.toString());

        // Mengubah nama pekerja dengan setter
        p1.setNama("Andi");
        System.out.println("\n=== Setelah Nama Diubah ===");
        System.out.println(p1.toString());
    }
}
