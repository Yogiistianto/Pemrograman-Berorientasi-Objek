/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_3;

/**
 *
 * @author HP
 */
public class Mobil {
    // Atribut dibuat private
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // Constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getTahun() {
        return tahun;
    }

    public String getWarna() {
        return warna;
    }

    // Setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method tambahan
    public void displayInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Warna : " + warna);
    }

    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }
}