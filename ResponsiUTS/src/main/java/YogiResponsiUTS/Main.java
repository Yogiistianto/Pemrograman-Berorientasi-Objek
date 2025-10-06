/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YogiResponsiUTS;

/**
 *
 * @author HP
 */
// Main class untuk uji coba
public class Main {
    public static void main(String[] args) {
        // 1. Output Produk
        System.out.println("1. Output Produk\n");
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        produk1.tampilkanInfo();

        // 2. Output Pegawai
        System.out.println("\n2. Output Pegawai\n");
        Pegawai pegawai1 = new PegawaiTetap("Budi", 5000000, 1000000);
        pegawai1.tampilkanInfo();

        // 3. Output Polimorfisme
        System.out.println("\n3. Output Polimorfisme\n");
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        produk2.tampilkanInfo();

        System.out.println();
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        pegawai2.tampilkanInfo();
    }
}

