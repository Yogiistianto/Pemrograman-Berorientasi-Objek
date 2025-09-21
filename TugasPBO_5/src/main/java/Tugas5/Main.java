/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        // Hewan
        Kucing kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.jenis = "Persia";
        kucing.tampilkanInfo();
        kucing.suara();

        System.out.println();

        Anjing anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.jenis = "Bulldog";
        anjing.tampilkanInfo();
        anjing.suara();
    }
}