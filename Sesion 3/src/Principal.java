public class Principal {
    public static void main(String[] args) {
        //Crear un pasajero
        Pasajero pasajero = new Pasajero("Hannia Treviño", "N90345");

        //Crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "Paris", "14:30");

        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado){
            System.out.println("Reserva realizada con éxito. \n");
        } else {
            System.out.println("No se realizo la reserva. \n");
        }

        System.out.println(vuelo.obtenerItinerario());

        System.out.println("Cancelando reserva... \n");
        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Ashton Irwin", "N78452");
        System.out.println(vuelo.obtenerItinerario());
    }
}