package taller_2.pkg1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TALLER_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("###,###,###.##");
        double Num_dias, KmDias, HospedajeDias, PeajeDia;
        double PrecioGaso = 3000;
        double kmxlitro = 10;
        double costgaso;
        double costotal;

        System.out.print("Cuantos días de viaje tuvo: ");
        Num_dias = sc.nextDouble();
        System.out.print("Cual fue su total de kilometros conducido por dia: ");
        KmDias = sc.nextDouble();
        System.out.print("Pago por estacionamiento: ");
        HospedajeDias = sc.nextDouble();
        System.out.print("Pago de peajes por dias: ");
        PeajeDia = sc.nextDouble();

        costgaso = (KmDias * Num_dias) / kmxlitro;
        costotal = (costgaso * PrecioGaso) + (PeajeDia * Num_dias) + (PeajeDia * Num_dias);

        System.out.println("El costo total del viaje es: " + "$" + formato.format(costotal));
    }

}
