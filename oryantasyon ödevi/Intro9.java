/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro9;

import java.util.Scanner;
/**
 *
 * @author Selin
 */
public class Intro9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	int not1;
		int not2;
		int not3;
		int ort;
		System.out.println("Lutfen sinav notlarinizi giriniz :");
		Scanner sc = new Scanner(System.in);
		
		not1 = sc.nextInt();
		not2 = sc.nextInt();
		not3 = sc.nextInt();
		ort = (not1 + not2 + not3)/3;
		System.out.println(ort);
		
		if(ort<50) {
			System.out.println("KALDI");
		}
		else {
			System.out.println("GECTI");
		}
    }
    
}
