/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author innoe
 */
public class PersegiPanjang051 extends BangunDatar051 {
    float panjang;
    float lebar;
    
    @Override 
    float luas(){
        float luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang = " + luas );
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 2*(panjang*lebar);
        System.out.println("Keliling Persegi Panjang = " + keliling);
        return keliling;
    }
    
}
