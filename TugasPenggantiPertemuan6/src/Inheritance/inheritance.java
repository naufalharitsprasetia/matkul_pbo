/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inheritance;


/**
 *
 * @author innoe
 */
public class inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 // membuat objek bangun datar
        BangunDatar051 bangunDatar = new BangunDatar051();
       
        // membuat objek persegi dan mengisi nilai properti
        Persegi051 persegi = new Persegi051();
        persegi.sisi = 2;
       
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran051 lingkaran = new Lingkaran051();
        lingkaran.r = 22;
       
        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang051 persegiPanjang = new PersegiPanjang051();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
       
        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga051 mSegitiga = new Segitiga051();
        mSegitiga.alas = 65;
        mSegitiga.tinggi = 5;
       
       
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
       
        persegi.luas();
        persegi.keliling();
       
        lingkaran.luas();
        lingkaran.keliling();
       
        persegiPanjang.luas();
        persegiPanjang.keliling();
       
        mSegitiga.luas();
        mSegitiga.keliling();
    
    }
    
}
