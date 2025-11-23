/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas11;

/**
 *
 * @author HP
 */
public class Pengarang {
    // Atribut
    private String namaPengarang;

    // Constructor
    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
        System.out.println("-> Objek Pengarang '" + this.namaPengarang + "' telah dibuat.");
    }

    // Metode
    public String infoPengarang() {
        return "Pengarang: " + this.namaPengarang;
    }
    
    // Getter untuk demonstrasi di Main
    public String getNamaPengarang() {
        return this.namaPengarang;
    }
}
