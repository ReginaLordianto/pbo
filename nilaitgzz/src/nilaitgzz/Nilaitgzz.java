/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaitgzz;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Nilaitgzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nilai
        Scanner inpt = new Scanner(System.in);
        String nama;
        char nhrf = 0;
        double nt1,nt2,nt3,mid,fin,nrata,nakhir;
        
        System.out.print("Nama : ");
        nama = inpt.next();
        System.out.print("Nilai tugas 1 : ");
        nt1 = inpt.nextInt();
        System.out.print("Nilai tugas 2 : ");
        nt2 = inpt.nextInt();
        System.out.print("Nilai tugas 3 : ");
        nt3 = inpt.nextInt();
        System.out.print("Nilai mid : ");
        mid = inpt.nextInt();
        System.out.print("Nilai final : ");
        fin = inpt.nextInt();
       
        nrata = (nt1+nt2+nt3)/3;
        nakhir = (0.3 * nrata) + (0.3 * mid) + (0.4 * fin);
        
        if(nakhir >=80){nhrf= 'A';}
        else if(nakhir >=60){nhrf= 'B';}
        else if(nakhir >=50){nhrf= 'C';}
        else if(nakhir >=40){nhrf= 'D';}
        else if(nakhir < 40){nhrf= 'E';}
        
        System.out.println();
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("Nilai akhir : " + nakhir);
        System.out.println("Nilai huruf : " + nhrf);
    }
    
}
