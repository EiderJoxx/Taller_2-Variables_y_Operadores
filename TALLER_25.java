package taller_2.pkg1;

import java.util.Scanner;

public class TALLER_25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Kmanzana = 52;
        double Kpera =  55;
        double Knaranja = 45;
        double Kmelon = 54;
        double Kpiña = 55;
        double Kfresa = 32;
        double CantidadManzana;
        double CantidadPera;
        double CantidadNaranja;
        double CantidadMelon;
        double CantidadPiña;
        double CantidadFresa;
        double Calorias;
        
        System.out.print("Cuantos manzanas te comeras?: "); 
        CantidadManzana = sc.nextDouble();
        System.out.print("Cuantos peras te comeras?: "); 
        CantidadPera = sc.nextDouble();
        System.out.print("Cuantos naranja te comeras?: "); 
        CantidadNaranja = sc.nextDouble();
        System.out.print("Cuantos melon te comeras?: "); 
        CantidadMelon = sc.nextDouble();
        System.out.print("Cuantos piña te comeras?: "); 
        CantidadPiña = sc.nextDouble();
        System.out.print("Cuantos fresa te comeras?: "); 
        CantidadFresa = sc.nextDouble();
        System.out.println("");
        
        Calorias = ((Kmanzana * CantidadManzana)+ (Kpera * CantidadPera) + (Knaranja * CantidadNaranja)+ (Kmelon * CantidadMelon )+(Kpiña * CantidadPiña)+(Kfresa * CantidadFresa));
        System.out.println("El total de calorias son: " +Calorias);
        System.out.println("");
        
        System.out.println("Calorias de la manzana: "+(Kmanzana * CantidadManzana));
        System.out.println("Calorias de la pera: "+(Kpera * CantidadPera));
        System.out.println("Calorias de la naranja: "+(Knaranja * CantidadNaranja));
        System.out.println("Calorias de la melon: "+(Kmelon * CantidadMelon));
        System.out.println("Calorias de la piña: "+(Kpiña * CantidadPiña));
        System.out.println("Calorias de la fresa: "+(Kfresa * CantidadFresa));
    }
    
}
    
    

