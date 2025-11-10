/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuags_9;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[]args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.suara();
        kucing.info();
        
        anjing.suara();
        anjing.info();
                
    }
}
