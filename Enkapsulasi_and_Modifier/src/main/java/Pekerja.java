/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Pekerja extends Manusia {
    private double gaji; // atribut tambahan, hanya bisa diakses dalam kelas ini

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // memanggil constructor Manusia
        this.gaji = gaji;
    }

    // Getter & Setter untuk gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Nama       : " + getNama() + "\n" +
               "Usia       : " + usia + "\n" +
               "Pekerjaan  : " + pekerjaan + "\n" +
               "Gaji       : Rp " + gaji;
    }
}