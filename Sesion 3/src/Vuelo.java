public class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigoVuelo,String destino, String horaSalida){
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p){
        if (asientoReservado == null){
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }
    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }
    public void cancelarReserva(){
        asientoReservado = null;
    }

    public String obtenerItinerario(){
        String info = "---Itinerario de vuelo---\n";
        info += "Codigo: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null){
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: Sin Reserva \n";
        }
        return info;
    }
}