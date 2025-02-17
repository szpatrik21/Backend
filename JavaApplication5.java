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
        
        /*if()
        {
            
        }
        else{
            if()
            {
                
            }
            else(){
                if()
                {
                    
                }
            }
        }*/
        
        double szazalek = 60.0;
        
        if (szazalek >= 80){
            System.out.println("Jeles");
        }
        else if (szazalek >= 60 && szazalek < 80){
            System.out.println("Jó");
        }
        else if ( szazalek >= 50 && szazalek < 60){
            System.out.println("Közepes");
        }
        else if ( szazalek >= 40 && szazalek < 50){
            System.out.println("Elégséges");
        }
        else{
            System.out.println("Elégtelen");
        }
        
        boolean res = (szazalek % 2 == 0);
        String eredmeny = (szazalek % 2 == 0) ? "Páros" : "Pártlan";
        System.out.println(eredmeny);
        
        
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Kérem a hónap számát (1-12): ");
        int honap = scanner.nextInt();
       
        switch (honap) {
            case 1:
                System.out.println("Január");
                break;
            case 2:
                System.out.println("Február");
                break;
            case 3:
                System.out.println("Március");
                break;
            case 4:
                System.out.println("Április");
                break;
            case 5:
                System.out.println("Május");
                break;
            case 6:
                System.out.println("Június");
                break;
            case 7:
                System.out.println("Július");
                break;
            case 8:
                System.out.println("Augusztus");
                break;
            case 9:
                System.out.println("Szeptember");
                break;
            case 10:
                System.out.println("Október");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Érvénytelen szám");
        
        }
    }
}   
