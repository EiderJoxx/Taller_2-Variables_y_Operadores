package taller_2.pkg1;

public class TALLER_23 {

    public static void main(String[] args) {
        float costoFijo = 49999;
        float iva = (float) 0.19;
        float margenUtilidad = (float) 0.15;
        float precioVenta = (costoFijo * iva + costoFijo) / (1 + margenUtilidad);
        float utilidad = precioVenta - costoFijo;
        System.out.println("Margen de utilidad: 15%\nPrecio de venta: " + precioVenta + "\n" + "Utilidad: " + utilidad);
    }
    
}
