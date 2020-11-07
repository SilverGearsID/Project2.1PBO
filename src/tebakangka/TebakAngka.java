/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
/**
 *
 * @author Rizky Alif
 */
import java.util.Scanner;
public class TebakAngka {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean stop = false;
        RandomInt angka = new RandomInt();
        angka.kocokan();
        while(stop == false){
            Scanner x = new Scanner(System.in);
            int jawab = x.nextInt();
            
            if (jawab < angka.x){
                System.out.println("Hehehe... Bilangan anda terlalu kecil!");
            }
            else if (jawab > angka.x){
                System.out.println("Hehehe... Bilangan anda terlalu besar!");
            }
            else{
                System.out.println("Yeeey! Bilangan tebakan anda benar!");
                stop = true;
            }
        }
    }
}
