/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro10;

/**
 *
 * @author Selin
 */
public class Intro10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int birinci = 1, ikinci = 1, sonuc = 0;
		
		System.out.print(birinci+""+ikinci);
		
		for(int i=0 ; i<10 ; i++) {
			sonuc = birinci + ikinci;
			birinci = ikinci;
			ikinci = sonuc;
			System.out.print("," + sonuc);
		}
    }
    
}
