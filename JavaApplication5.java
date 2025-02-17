package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
        
        int szam = 5;
        
        if (szam >= 0){
            System.out.println("A szám pozitív");
        }
        else{
            System.out.println("A szám negatív");
        }  
        
        System.out.println("Kérek egy számot");
        Scanner be = new Scanner(System.in);
        int a = be.nextInt();
        System.out.println("Kérek egy másik számot");
        int b = be.nextInt();
        
        if(a < b){                                          
            System.out.printf("A %d nagyobb mint %d", b, a);
        }                                                   
        else{
            System.out.printf("A %d nagyobb mint %d", a, b);
        }
        
        int egesz = 30;
        if (egesz % 10 == 0 && egesz % 3 == 0){
            System.out.println("A 30 osztható 10-zel és 3-mal maradék nélkül ");
        }
        else{
             System.out.println("A 30 nem osztható 10-zel és 3-mal maradék nélkül ");
        }
        int egesz2 = 27;
        if (egesz2 % 10 == 0 && egesz2 % 3 == 0){
            System.out.println("A 27 osztható 10-zel és 3-mal maradék nélkül ");
        }
        else{
             System.out.println("A 27 nem osztható 10-zel és 3-mal maradék nélkül ");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    } 
}