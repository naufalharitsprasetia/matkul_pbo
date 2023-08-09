/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author innoe
 */
public class Lingkaran051 extends BangunDatar051 {
    float r;
    
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran : " + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling  = (float) (2* Math.PI * r);
        System.out.println("Keliling Lingkaran : " + keliling);
        return keliling;
    }
}
