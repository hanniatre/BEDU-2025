public class CajaRegistradora {
    public static void main(String[] args) {

        MetodoPago[] pagos = {
                new PagoEfectivo(100.00),
                new PagoTarjeta(250.00, 600.00),
                new PagoTransferencia(250.00, false)
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Autenticacion exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticacion. " + pago.getClass().getSimpleName() + " no valido.");
            }
            System.out.println();
        }
    }
}