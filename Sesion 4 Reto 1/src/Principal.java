public class Principal {
    public static void main(String[] args) {

        //Creamos dos facturas con mismo folio
        Factura f1 = new Factura("FAC001", "Hannia T.", 1450.00);
        Factura f2 = new Factura("FAC001", "Valeria P.", 1450.00);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}