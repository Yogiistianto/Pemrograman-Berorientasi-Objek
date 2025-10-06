/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YogiResponsiUTS;

/**
 *
 * @author HP
 */
class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("gaji: Rp." + gaji);
    }
}

class PegawaiTetap extends Pegawai {
    private double tunjangan;
    
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    public double getTunjangan(){
        return tunjangan;
    }
    
    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: Rp." + tunjangan);
    }
}

class PegawaiKontrak extends Pegawai{
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak){
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    
    public void setLamaKontrak(int lamaKontrak){
        this.lamaKontrak = lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan.");
    }
}