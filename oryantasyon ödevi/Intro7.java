/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro7;

import java.util.Scanner;
/**
 *
 * @author Selin
 */
public class Intro7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(ax² + bx + c)ikinci dereceden denklem \n sabitleri sirayla gir");
        
        System.out.println("a degerini giriniz: ");
        double a = sc.nextDouble();
        System.out.println("b degerini giriniz: ");
        double b = sc.nextDouble();
        System.out.println("c degerini giriniz: ");
        double c = sc.nextDouble();
        double delta = (b * b)-(4  *a * c);
        
        if(delta>0) {
            double x1 = ((-1*b)-Math.sqrt(delta))/(2*a);
            double x2 = ((-1*b)-Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }
        if(delta<0) {
            System.out.println("Denklemin gercek koku yoktur");
        }
        if(delta==0) {
            String x = null;
            System.out.println("Denklemin çakışık kökü var x1 = x2 = " + x);
        } 
    }
    
}
