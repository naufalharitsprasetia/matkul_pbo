/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author innoe
 */
public class Segitiga051 extends BangunDatar051 {
    float alas;
    float tinggi;
    
    @Override
    float luas(){
        float luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga = " + luas);
        return luas;
    }
    
}
