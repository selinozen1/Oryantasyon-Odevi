/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author Selin
 */
public class JavaApplication3 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI_SAYISI = 3.141593;
        Scanner giriş = new Scanner(System.in);
        
        System.out.println("Lütfen yari capi giriniz");
        double yaricap = giriş.nextDouble();
        double cevre = 2 * PI_SAYISI * yaricap;
        System.out.println(yaricap + "yaricaplı dairenin cevresi" + cevre + "dir");
        
       
    }
    
} 
