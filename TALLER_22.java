package taller_2.pkg1;

public class TALLER_22 {

    public static void main(String[] args) {
        double a = 232.33d;
        double b = 213.22d;
        double c = 532.11d;
        double suma = (a+b+c);
        double promedio = (a+b+c)/3;
        double producto = (a*b*c);
        double cociente = (a+b/c);
        double modulo = (a%b%c);
        suma = Math.round(suma * 100) / 100d;
        System.out.println(suma);
        promedio = Math.round(promedio * 100) / 100d;
        System.out.println(promedio);
        producto = Math.round(producto * 100) / 100d;
        System.out.println(producto);
        cociente = Math.round(cociente * 100) / 100d;
        System.out.println(cociente);
        modulo = Math.round(modulo * 100) / 100d;
        System.out.println(modulo);

    }
    
}
