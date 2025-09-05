/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_3;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Merah");

        mobil1.startEngine();
        mobil1.displayInfo();

        System.out.println();

        mobil2.startEngine();
        mobil2.displayInfo();

        // Mengubah warna mobil2 dengan setter
        mobil2.setWarna("Biru");

        System.out.println("\nSetelah warna diubah:");
        mobil2.displayInfo();
    }
}
