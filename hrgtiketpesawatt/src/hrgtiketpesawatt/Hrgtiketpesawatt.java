/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrgtiketpesawatt;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Hrgtiketpesawatt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner inpt = new Scanner(System.in);
       String nama,alamat,tipe;
       int byr,hrg=0,kembali,A,B,C;
       
       System.out.print("Nama : ");
       nama = inpt.next();
       System.out.print("Alamat : ");
       alamat = inpt.next();
       System.out.print("Tipe pesawat : ");
       tipe = inpt.next();
       System.out.print("Bayar : ");
       byr = inpt.nextInt();
       
       switch(tipe){
               case "A":hrg=5000000;
               break;
               case "B":hrg=2000000;
               break;
               case "C":hrg=1000000;
               break;
       }
       kembali=byr-hrg;
       System.out.println();
       System.out.println();
       System.out.println("Nama : " + nama);
       System.out.println("Alamat : " + alamat);
       System.out.println("Kembalian : " + kembali);
    }
    
}
