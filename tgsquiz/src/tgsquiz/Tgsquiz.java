/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsquiz;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tgsquiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner inpt = new Scanner(System.in);
       String nama, alamat, jeniskelamin, jabatan, status;
       int gajibersih, gajipokok=0, biayaasuransi=0;
       
       System.out.print("Nama : ");
       nama = inpt.next();
       System.out.print("Alamat : ");
       alamat = inpt.next();
       System.out.print("Jenis Kelamin : ");
       jeniskelamin = inpt.next();
       System.out.print("Jabatan : ");
       jabatan = inpt.next();
       System.out.print("Status : ");
       status = inpt.next();
       
       if ((jeniskelamin.equals("l")) && (jabatan.equals("m"))){gajipokok = 5000000;}
       if ((jeniskelamin.equals("l")) && (jabatan.equals("t"))){gajipokok = 3000000;}
       if ((jeniskelamin.equals("p")) && (jabatan.equals("m"))){gajipokok = 6000000;}
       if ((jeniskelamin.equals("p")) && (jabatan.equals("t"))){gajipokok = 4000000;}
       
       if (status.equals("bpjs")){
       biayaasuransi = 80000;}
       if (status.equals("umum")){
       biayaasuransi = 100000;}
       
       gajibersih = gajipokok - biayaasuransi;
       
       System.out.println();
       System.out.println();
       System.out.println("Nama : " + nama);
       System.out.println("Alamat : " + alamat);
       System.out.println("Gaji Bersih : " + gajibersih);
    }
    
}
