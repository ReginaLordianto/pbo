/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byrzpln;
import java.util.Scanner;

/**
 *
 * @author User
 */

class pln{
        String nama;
        String alamat;
        String blok;
        int typermh;
        int byr, kmbli;


void cetakpln(){
    System.out.println("Nama = " + nama);
    System.out.println("Alamat = " + alamat);
    System.out.println("Harga = " + byr);
    System.out.println("Kembalian = " + kmbli);
}
}

public class Byrzpln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, alamat, blok;
        int byr, hrg=0, kmbli, type_rmh;
        
        Scanner inpt = new Scanner(System.in);
        System.out.print("Nama = ");
        nama=inpt.nextLine();
        System.out.print("Alamat = ");
        alamat=inpt.nextLine();
        System.out.print("Tipe Blok = ");
        blok=inpt.nextLine();
        System.out.print("Tipe Rumah = ");
        type_rmh=inpt.nextInt();
        
        blok=blok.toUpperCase();
        
        switch(type_rmh){
            case 36:
                switch (blok){
                    case "A":
                        hrg = 500000;
                        break;
                    case"B":
                        hrg = 300000;
                        break;
                }
                break;
                
            case 37:
                switch (blok){ 
                    case "A":
                        hrg = 800000;
                        break;
                    case "B":
                        hrg = 600000;
                        break;
                }
                }
        
         System.out.println("\nHarga = " + hrg);
         System.out.print("Harga Bayar = ");
         byr=inpt.nextInt();
         kmbli= byr-hrg;
         System.out.println("Kembalian = " + kmbli);
         
         
         System.out.println();
         System.out.println();
         System.out.println(" Data Pembayaran PLN ");
         pln datapln = new pln();
         datapln.nama = nama;
         datapln.alamat = alamat;
         datapln.byr= byr;
         datapln.kmbli = kmbli;
         
         datapln.cetakpln();
        }
    }
   
