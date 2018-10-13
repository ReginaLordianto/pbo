/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxxminn;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Maxxminn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // max-min
        Scanner inpt = new Scanner(System.in);
        int n1,n2,n3,n4,n5,max,min;
        
        System.out.print("Masukkan nilai 1 = ");
        n1 = inpt.nextInt();
        System.out.print("Masukkan nilai 2 = ");
        n2 = inpt.nextInt();
        System.out.print("Masukkan nilai 3 = ");
        n3 = inpt.nextInt();
        System.out.print("Masukkan nilai 4 = ");
        n4 = inpt.nextInt();
        System.out.print("Masukkan nilai 5 = ");
        n5 = inpt.nextInt();
        
        max=n1;
        min=n1;
        
        if(n2>max){max=n2;}
        if(n3>max){max=n3;}
        if(n4>max){max=n4;}
        if(n5>max){max=n5;}
        System.out.println("Nilai max = " + max);
        
        if(n2<min){min=n2;}
        if(n3<min){min=n3;}
        if(n4<min){min=n4;}
        if(n5<min){min=n5;}
        System.out.println("Nilai min = " + min);
    }
    
}
